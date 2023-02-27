package course.linkflower.link.oneframework.members.dto.bookborrowrecord;

import course.linkflower.link.oneframework.members.model.BookBorrowRecord;
import lombok.Data;

@Data
public class UpdateBookBorrowRecordDto {
    private String clientId;
    private String borrowId;
    private String bookId;
    private String bookInforId;
    private String startDate;
    public BookBorrowRecord toModel(){
        BookBorrowRecord b = new BookBorrowRecord();
        b.setClientId(Long.parseLong(clientId));
        b.setBorrowId(Long.parseLong(borrowId));
        b.setBookId(Long.parseLong(bookId));
        b.setBookInforId(Long.parseLong(bookInforId));
        return b;
    }
}
