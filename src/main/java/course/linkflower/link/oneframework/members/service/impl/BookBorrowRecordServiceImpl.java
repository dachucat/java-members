package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.*;
import course.linkflower.link.oneframework.members.dto.book.BookShortInfoVo;
import course.linkflower.link.oneframework.members.dto.bookShelf.BookShelfInfoVo;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.AddBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.DeleteBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.SearchBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.UpdateBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.SearchByDateDto;
import course.linkflower.link.oneframework.members.model.*;
import course.linkflower.link.oneframework.members.service.BookBorrowRecordService;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.members.vo.bookborrowrecordvo.BookBorrowRecordVo;
import course.linkflower.link.oneframework.members.vo.borrowcard.BorrowCardInfoVo;
import course.linkflower.link.oneframework.members.vo.client.ClientInfoVo;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherInfoVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BookBorrowRecordServiceImpl implements BookBorrowRecordService {
    @Autowired
    BookBorrowRecordMapper bookBorrowRecordMapper;
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookInfoMapper bookInfoMapper;
    @Autowired
    BookShelfMapper bookShelfMapper;
    @Autowired
    PublisherMapper publisherMapper;
    @Autowired
    ClientMapper clientMapper;
    @Autowired
    BorrowCardMapper borrowCardMapper;
    @Override
    public void addBookBorrowRecord(AddBookBorrowRecordDto addBookBorrowRecordDto) {
            bookBorrowRecordMapper.save(addBookBorrowRecordDto.toModel());
    }

    @Override
    public void updateBookBorrowRecord(UpdateBookBorrowRecordDto updateBookBorrowRecordDto) {
            bookBorrowRecordMapper.update(updateBookBorrowRecordDto.toModel());
    }

    @Override
    public void deleteBookBorrowRecord(DeleteBookBorrowRecordDto deleteBookBorrowRecordDto) {
            bookBorrowRecordMapper.delete(Long.parseLong(deleteBookBorrowRecordDto.getId()));
    }

    @Override
    public BookBorrowRecordVo getBookBorrowRecordById(SearchBookBorrowRecordDto searchBookBorrowRecordDto) {
        return new BookBorrowRecordVo().loadFrom(bookBorrowRecordMapper.getBookBorrowRecordById(Long.parseLong(searchBookBorrowRecordDto.getId())));
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
            List<BookBorrowRecord> records = bookBorrowRecordMapper.listByDate(startDate, endDate,
                    searchByDateDto.getPageCount() * searchByDateDto.getPageNo(),
                    searchByDateDto.getPageCount());

            //根据时间范围列出借书记录数量
            int total = bookBorrowRecordMapper.getByDateTotal(startDate, endDate);
            //计算分页数量
            int pageCount = total / searchByDateDto.getPageCount();
            if ((total - (pageCount * searchByDateDto.getPageCount())) > 0) {
                pageCount += 1;
            }
            ret.setPageCount(pageCount);
            ret.setTotal(total);

            //从借书记录中获取图书id到bookIds数组
            List<Long> bookIds = new ArrayList<>();
            Map<Long, Boolean> clientIds = new HashMap<>();
            Map<Long,Boolean> borrowCardIds = new HashMap<>();
            for (BookBorrowRecord r : records) {
                bookIds.add(r.getBookId());
                //从借阅记录中获得借书用户的id
                clientIds.put(r.getClientId(),Boolean.TRUE);
                //从借阅记录中获得借书证id
                borrowCardIds.put(r.getBorrowCardId() , Boolean.TRUE);
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
            //获得借书记录

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
                for (Publisher pi : publisherMapper. listByIds(publisherIds.keySet())) {
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


            Map<Long , Client> clientMap = new HashMap<>();
            if (clientIds.size() > 0){
                //根据索引到的clientId列出用户信息，并放置到clientMap
                for (Client client : clientMapper.listByIds(clientIds.keySet())){
                    clientMap.put(client.getId(), client);
                }
            }
            Map<Long , BorrowCard> borrowCardMap= new HashMap<>();
            if(borrowCardIds.size()>0){
                //根据索引到的borrowcardid列出借书证信息，并放到borrowcardmap
                for (BorrowCard borrowCard : borrowCardMapper.listByIds(borrowCardIds.keySet())){
                    borrowCardMap.put(borrowCard.getId(),borrowCard);
                }
            }

            for (BookBorrowRecord r : records) {
                BookDetailVo bd = new BookDetailVo();
                Book b = bookMap.get(r.getBookId());
                BookInfo bisi = null;
                Publisher p = null;
                Bookshelf bs = null;
                Client c = null;
                BorrowCard bc = null;
                if (b != null) {
                    bisi = bookInfoMap.get(b.getBookInforId());
                    if (bisi != null) {
                        p = publisherMap.get(bisi.getPublisherId());
                    }
                    bs = bookShelfMap.get(b.getBookShelfId());
                    c = clientMap.get(r.getClientId());
                    bc = borrowCardMap.get(r.getBorrowCardId());
                }


                bd.loadFrom(r);
                bd.setBook(new BookShortInfoVo().loadFrom(b));
                bd.setBookInfo(new BookInforShortVo().loadFrom(bisi));
                bd.setBookShelf(new BookShelfInfoVo().loadFrom(bs));
                bd.setPublisher(new PublisherInfoVo().loadFrom(p));
                bd.setBorrower(new ClientInfoVo().loadFrom(c));
                bd.setBorrowCard(new BorrowCardInfoVo().loadFrom(bc));
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
