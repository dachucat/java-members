package course.linkflower.link.oneframework.members.dto.book;

import course.linkflower.link.oneframework.members.model.Book;
import lombok.Data;

@Data
public class BookShortInfoVo {
    private String id;
    private String bookInfoId;
    private String barcode;

    public BookShortInfoVo loadFrom(Book b) {
        if (b != null) {
            id = String.valueOf(b.getId());
            bookInfoId = String.valueOf(b.getBookInforId());
            barcode = b.getBarcode();
        }
        return this;
    }
}
