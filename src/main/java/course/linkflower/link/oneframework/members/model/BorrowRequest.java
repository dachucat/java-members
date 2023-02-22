package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("borrow_request")
public class BorrowRequest {
    private long id;
    private long bookInfoId;
    private String remark;
    private long clientId;
    private int type;
    private String borrowDate;
}
