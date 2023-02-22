package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import org.w3c.dom.Text;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("author")
public class Author extends Model<Author> {
    private long id;
    private String name;
    private String phone;
    private String country;
    private String address;
    private String mail;
    private String remark;
}
