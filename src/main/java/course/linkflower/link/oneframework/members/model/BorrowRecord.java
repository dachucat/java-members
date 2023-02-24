package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("borrow_record")
public class BorrowRecord {
    private long id;
    private long clientId;
    private long bookId;
    private long borrowCardId;
    private int status;
    private String startDate;
    private String endDate;
    private String remark;
}
