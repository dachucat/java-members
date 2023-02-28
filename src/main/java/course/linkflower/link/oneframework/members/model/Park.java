package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("park")
public class Park {
    private String name;
    private long id;
    private Long parentId;
    private String icon;
    private String code;
    private Long ordering;
    private byte type;
    private String introduction;
    private String barcode;
}
