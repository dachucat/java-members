package course.linkflower.link.oneframework.members.dto.bookShelf;

import course.linkflower.link.oneframework.members.model.Bookshelf;
import lombok.Data;

@Data
public class BookShelfInfoVo {
    private String id;
    private String name;

    public BookShelfInfoVo loadFrom(Bookshelf bs) {
        if (bs != null) {
            id = String.valueOf(bs.getId());
            name = bs.getName();
        }
        return this;
    }
}
