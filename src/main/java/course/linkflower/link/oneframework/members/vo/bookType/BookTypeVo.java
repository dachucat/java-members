package course.linkflower.link.oneframework.members.vo.bookType;

import course.linkflower.link.oneframework.members.model.BookType;
import lombok.Data;

@Data
public class BookTypeVo {
    private String id;
    private String name;

    public BookTypeVo loadFrom(BookType bookType){
        if (bookType != null){
            name = bookType.getName();
        }
        return this;
    }
}
