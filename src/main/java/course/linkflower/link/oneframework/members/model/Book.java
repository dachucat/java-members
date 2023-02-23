package course.linkflower.link.oneframework.members.model;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("book")
public class Book {
    private long id;
    private long bookInforId;
    private long bookShelfId;
    private long borrowRecordId;
    private int status;
    private Date inLibraryDate;
    private Date destroyDate;
    private String barcode;
}
