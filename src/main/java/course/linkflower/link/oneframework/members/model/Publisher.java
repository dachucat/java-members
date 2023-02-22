package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("publisher")
public class Publisher {
    private String name;
    private String phone;
    private String country;
    private String address;
    private long id;

}
