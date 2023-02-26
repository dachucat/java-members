package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("client")
public class Client {
    private long id;
    private String name;
    private String mail;
    private String account;
    private String  password;
    private String mobile;
    private byte status;
    private String address;
    private String avatar;
}
