package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("book")
public class Book {
    private long id;
    private long bookInfoId;
    private long bookShelfId;
    private long borrowRecordId;
    private int status;
    private String inLibraryDate;
    private String destroyDate;
    private String barcode;
}
