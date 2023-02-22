package course.linkflower.link.oneframework.members.dto.milkPractice;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("author")
public class AuthorDto {
    private long id;
    private String name;
    private String phone;
    private String country;
    private String address;
    private String mail;
    private String remark;
}
