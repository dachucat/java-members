package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_company")
public class CarCompany {
    private long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String icon;
}
