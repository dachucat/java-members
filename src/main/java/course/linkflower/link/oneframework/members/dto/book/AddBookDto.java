package course.linkflower.link.oneframework.members.dto.book;

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
public class AddBookDto {
    private String bookInforId;
    private DateTime inLibraryDate;
}
