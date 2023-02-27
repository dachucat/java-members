package course.linkflower.link.oneframework.members.vo.book;

import course.linkflower.link.oneframework.members.dto.book.BookShortInfoVo;
import course.linkflower.link.oneframework.members.dto.bookShelf.BookShelfInfoVo;
import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.model.BookBorrowRecord;
import course.linkflower.link.oneframework.members.model.BorrowRecord;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordInfoVo;
import course.linkflower.link.oneframework.members.vo.borrowcard.BorrowCardInfoVo;
import course.linkflower.link.oneframework.members.vo.client.ClientInfoVo;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherInfoVo;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class BookDetailVo {
    private String id;

    private BookInforShortVo bookInfo;
    //借书人
    private ClientInfoVo borrower;

    private BorrowRecordInfoVo borrowRecord;

    private BorrowCardInfoVo borrowCard;

    private BookShelfInfoVo bookShelf;

    private BookShortInfoVo book;

    private PublisherInfoVo publisher;

    public BookDetailVo loadFrom(BookBorrowRecord r) {
        if (r != null) {
            id = String.valueOf(r.getId());
        }
        return this;
    }
}
