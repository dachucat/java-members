package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.*;
import course.linkflower.link.oneframework.members.dto.book.BookShortInfoVo;
import course.linkflower.link.oneframework.members.dto.bookShelf.BookShelfInfoVo;
import course.linkflower.link.oneframework.members.dto.borrowRecord.*;
import course.linkflower.link.oneframework.members.model.*;
import course.linkflower.link.oneframework.members.service.BorrowRecordService;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherInfoVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BorrowRecordServiceImpl implements BorrowRecordService {
    @Autowired
    BorrowRecordMapper borrowRecordMapper;

    @Autowired
    BookInfoMapper bookInfoMapper;

    @Autowired
    BookMapper bookMapper;

    @Autowired
    BookShelfMapper bookShelfMapper;

    @Autowired
    PublisherMapper publisherMapper;

    @Override
    public void addBorrowRecord(AddBorrowRecordDto addBorrowRecordDto) {
        borrowRecordMapper.save(Long.parseLong(addBorrowRecordDto.getClientId()),addBorrowRecordDto.getStartDate());
    }

    @Override
    public void updateBorrowRecord(UpdateBorrowRecordDto updateBorrowRecordDto) {
        borrowRecordMapper.update(Long.parseLong(updateBorrowRecordDto.getClientId()));
    }

    @Override
    public void deleteBorrowRecord(DeleteBorrowRecordDto deleteBorrowRecordDto) {
        borrowRecordMapper.delete(Long.parseLong(deleteBorrowRecordDto.getId()));
    }

    @Override
    public BorrowRecordVo getBorrowRecordById(SearchBorrowRecordDto searchBorrowRecordDto) {
        return new BorrowRecordVo().loadFrom(borrowRecordMapper.borrowRecordSearchByid(Long.parseLong(searchBorrowRecordDto.getId())));
    }

    @Override
    public Result<PageModelResult<List<BookDetailVo>>> listBookByDate(SearchByDateDto searchByDateDto) {
        PageModelResult<List<BookDetailVo>> ret = new PageModelResult<>();
        List<BookDetailVo> retList = new ArrayList<>();
        ret.setData(retList);

        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        try {
            Date startDate = sdf.parse(searchByDateDto.getStartDate());
            Date endDate;
            if (!StringUtils.isEmpty(searchByDateDto.getEndDate())) {
                endDate = sdf.parse(searchByDateDto.getEndDate());
            } else {
                endDate = new Date();
            }
            //分页根据时间范围列出借书记录
            List<BorrowRecord> records = borrowRecordMapper.listByDate(startDate, endDate,
                    searchByDateDto.getPageCount() * searchByDateDto.getPageNo(),
                    searchByDateDto.getPageCount());

            //根据时间范围列出借书记录数量
            int total = borrowRecordMapper.getByDateTotal(startDate, endDate);
            //计算分页数量
            int pageCount = total / searchByDateDto.getPageCount();
            if ((total - (pageCount * searchByDateDto.getPageCount())) > 0) {
                pageCount += 1;
            }
            ret.setPageCount(pageCount);
            ret.setTotal(total);

            //从借书记录中获取图书id到bookIds数组
            List<Long> bookIds = new ArrayList<>();
            for (BorrowRecord r : records) {
                bookIds.add(r.getBookId());
            }

            Map<Long, Boolean> bookInfoIdMap = new HashMap<>();
            Map<Long, Book> bookMap = new HashMap<>();
            Map<Long, Boolean>  bookShelfIds = new HashMap<>();
            //预防sql in 字段为空 select * from book where id in (1, 2, 3), select * from book where id in ()
            if (bookIds.size() > 0) {
                for (Book b :bookMapper.listByIds(bookIds)) {
                    //根据book id 的索引，存储book 实体到 bookMap
                    bookMap.put(b.getId(), b);
                    //获取bookInforId 列表，利用map去重
                    bookInfoIdMap.put(b.getBookInforId(), Boolean.TRUE);
                    bookShelfIds.put(b.getBookShelfId(), Boolean.TRUE);
                }
            }


            Map<Long, Boolean>  publisherIds = new HashMap<>();
            Map<Long, BookInfo> bookInfoMap = new HashMap<>();
            if (bookInfoIdMap.size() > 0) {
                //根据索引到的bookInforId列出图书信息，并放置到bookInfoMap
                for (BookInfo bi : bookInfoMapper.listByIds(bookInfoIdMap.keySet())) {
                    bookInfoMap.put(bi.getId(), bi);
                    publisherIds.put(bi.getPublisherId(), Boolean.TRUE);
                }
            }

            Map<Long, Publisher> publisherMap = new HashMap<>();
            if (publisherIds.size() > 0) {
                //根据索引到的bookInforId列出图书信息，并放置到bookInfoMap
                for (Publisher pi : publisherMapper.listByIds(publisherIds.keySet())) {
                    publisherMap.put(pi.getId(), pi);
                }
            }

            Map<Long, Bookshelf> bookShelfMap = new HashMap<>();
            if (bookShelfIds.size() > 0) {
                //根据索引到的bookInforId列出图书信息，并放置到bookInfoMap
                for (Bookshelf bs : bookShelfMapper.listByIds(bookShelfIds.keySet())) {
                    bookShelfMap.put(bs.getId(), bs);
                }
            }

            for (BorrowRecord r : records) {
                BookDetailVo bd = new BookDetailVo();
                Book b = bookMap.get(r.getBookId());
                BookInfo bisi = null;
                Publisher p = null;
                Bookshelf bs = null;
                if (b != null) {
                    bisi = bookInfoMap.get(b.getBookInforId());
                    if (bisi != null) {
                        p = publisherMap.get(bisi.getPublisherId());

                    }
                    bs = bookShelfMap.get(b.getBookShelfId());
                }
                bd.loadFrom(r);
                bd.setBook(new BookShortInfoVo().loadFrom(b));
                bd.setBookInfo(new BookInforShortVo().loadFrom(bisi));
                bd.setBookShelf(new BookShelfInfoVo().loadFrom(bs));
                bd.setPublisher(new PublisherInfoVo().loadFrom(p));

                /*
                ok
                {
                    "id": null,
                    "bookInfo": {
                        "id": null,
                        "name": null
                    },
                    "book": {
                        "id": null
                    }
                }
                error
                {
                    "id": null,
                    "bookInfo": null,
                    "book": null
                }
                if (bd.bookInfo && bd.bookInfo.id != null) {
                }
                 */
                retList.add(bd);
            }

        } catch (ParseException pe) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeFormatError, BaseErrorContst.BaseMsgTimeFormatError);
        }
        return Result.succeed(ret);
    }
}
