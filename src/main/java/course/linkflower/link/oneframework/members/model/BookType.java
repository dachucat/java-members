package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("book_type")
public class BookType {
    private long id;
    private String name;
}
