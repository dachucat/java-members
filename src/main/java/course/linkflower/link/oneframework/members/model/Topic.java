package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.math.BigInteger;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("topic")
public class Topic {
    private String name;
    private long id;
    private Long parentId;
    private Long parent1Id;
    private byte columnType;
    private byte isHot;
    private String icon;
    private int sortValue;
}
