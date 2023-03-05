package course.linkflower.link.oneframework.members.model;

import com.alibaba.druid.pool.ha.selector.StickyDataSourceHolder;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_brand")
public class CarBrand {
    private long id;
    private String icon;
    private String name;
    private long carCompanyId;
}
