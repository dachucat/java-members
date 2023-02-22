package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("book_shelf")
public class Bookshelf {
    private long id;
    private String name;
    private int type;
    private String barcode;
    private int status;

}
