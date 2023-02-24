package course.linkflower.link.oneframework.members.vo.bookInfo;

import course.linkflower.link.oneframework.members.model.BookInfo;
import lombok.Data;

@Data
public class BookInforShortVo {
    private String id;
    private String name;

    public BookInforShortVo loadFrom(BookInfo bi) {
        if (bi != null) {
            id = String.valueOf(bi.getId());
            name = bi.getName();
        }
        return this;
    }
}
