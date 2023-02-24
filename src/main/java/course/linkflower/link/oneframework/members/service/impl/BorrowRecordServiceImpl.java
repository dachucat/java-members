package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.BookInfoMapper;
import course.linkflower.link.oneframework.members.dao.BookMapper;
import course.linkflower.link.oneframework.members.dao.BorrowRecordMapper;
import course.linkflower.link.oneframework.members.dto.book.BookShortInfoVo;
import course.linkflower.link.oneframework.members.dto.borrowRecord.*;
import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.model.BookInfo;
import course.linkflower.link.oneframework.members.model.BorrowRecord;
import course.linkflower.link.oneframework.members.service.BorrowRecordService;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;
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
    public Result<PageResult<List<BookDetailVo>>> listBookByDate(SearchByDateDto searchByDateDto) {
        PageResult<List<BookDetailVo>> ret = new PageResult<List<BookDetailVo>>();
        List<BookDetailVo> retList = new ArrayList<>();
        ret.setData(retList);

        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss=");
        try {
            Date startDate = sdf.parse(searchByDateDto.getStartDate());
            Date endDate = sdf.parse(searchByDateDto.getEndDate());
            List<BorrowRecord> records = borrowRecordMapper.listByDate(startDate, endDate,
                    searchByDateDto.getPageCount() * searchByDateDto.getPageNo(),
                    searchByDateDto.getPageCount());

            int total = borrowRecordMapper.getByDateTotal(startDate, endDate);
            int pageCount = total / searchByDateDto.getPageCount();
            if ((total - (pageCount * searchByDateDto.getPageCount())) > 0) {
                pageCount += 1;
            }
            ret.setPageCount(pageCount);
            ret.setTotal(total);

            List<Long> bookIds = new ArrayList<>();
            for (BorrowRecord r : records) {
                bookIds.add(r.getBookId());
            }

            Map<Long, Long> bookInfoIdMap = new HashMap<>();
            Map<Long, Book> bookMap = new HashMap<>();
            if (bookIds.size() > 0) {
                for (Book b :bookMapper.listBookByIds(bookIds)) {
                    bookMap.put(b.getId(), b);
                    bookInfoIdMap.put(b.getBookInforId(), b.getBookInforId());
                }
            }

            Map<Long, BookInfo> bookInfoMap = new HashMap<>();
            if (bookMap.size() > 0) {
                for (BookInfo bi : bookInfoMapper.listByIds(bookInfoIdMap.keySet())) {
                    bookInfoMap.put(bi.getId(), bi);
                }
            }

            for (BorrowRecord r : records) {
                BookDetailVo bd = new BookDetailVo();
                Book b = bookMap.get(r.getBookId());
                BookInfo bisi = null;
                if (b != null) {
                    bisi = bookInfoMap.get(b.getBookInforId());
                }
                bd.setBook(new BookShortInfoVo().loadFrom(b));
                bd.setBookInfo(new BookInforShortVo().loadFrom(bisi));

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
