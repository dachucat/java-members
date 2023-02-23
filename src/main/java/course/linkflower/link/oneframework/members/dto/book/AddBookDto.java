package course.linkflower.link.oneframework.members.dto.book;

import cn.hutool.core.date.DateTime;
import course.linkflower.link.oneframework.members.model.Book;
import lombok.Data;

@Data
public class AddBookDto {
    private String id;
    private String bookInforId;
    private DateTime inLibraryDate;

    public Book toModel() {
        Book b = new Book();
        b.setBookInforId(Long.parseLong(bookInforId));
        b.setInLibraryDate(inLibraryDate);
        return b;
    }
}
