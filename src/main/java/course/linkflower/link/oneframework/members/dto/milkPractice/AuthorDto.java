package course.linkflower.link.oneframework.members.dto.milkPractice;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
public class AuthorDto {
    private long id;
    private String name;
    private String phone;
    private String country;
    private String address;
    private String mail;
    private String remark;
}
