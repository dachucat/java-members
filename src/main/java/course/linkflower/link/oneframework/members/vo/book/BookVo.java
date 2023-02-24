package course.linkflower.link.oneframework.members.vo.book;

import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.members.vo.client.ClientInfoVo;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class BookVo {
    private String id;

    private String bookshelfName;

    private String publisher;

    private String name;
    private long bookInforId;
    private long bookShelfId;
    private long borrowRecordId;

    private BookInforShortVo bookInfo;
    //借书人
    private ClientInfoVo borrower;

    private int status;
    private Date inLibraryDate;
    private Date destroyDate;
    private String barcode;

    public BookVo loadFrom(Book m) {
        if (m != null) {
            id = String.valueOf(m.getId());
            bookInforId = m.getBookInforId();
            bookShelfId = m.getBookShelfId();
            borrowRecordId = m.getBorrowRecordId();
            status = m.getStatus();
            inLibraryDate = m.getInLibraryDate();
            destroyDate = m.getDestroyDate();
            barcode = m.getBarcode();
        }
        return this;
    }

    public static List<BookVo> loadFromList(List<Book> list) {
        List<BookVo> ret = new ArrayList<>();
        for (Book l : list) {
            ret.add(new BookVo().loadFrom(l));
        }
        return ret;
    }
}
