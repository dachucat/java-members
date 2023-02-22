package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("third_auth")
public class ThirdAuth {
    private long id;
    private long clientId;
    private String code;
    private int authType;
    private int status;
}
