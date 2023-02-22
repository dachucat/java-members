package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("book_infor")
public class BookInfo {
    private long id;
    private String name;
    private long publisherId;
    private String version;
    private BigDecimal price;
    private String barcode;
    private long count;

}
