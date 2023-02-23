package course.linkflower.link.oneframework.members.vo.book;

import course.linkflower.link.oneframework.members.model.Book;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookVo {
    private String id;

    private String bookshelfName;

    private String name;
    private long bookInfoId;
    private long bookShelfId;
    private long borrowRecordId;
    private int status;
    private String inLibraryDate;
    private String destroyDate;
    private String barcode;

    public BookVo loadFrom(Book m) {
        if (m != null) {
            id = String.valueOf(m.getId());
            bookInfoId = m.getBookInfoId();
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
