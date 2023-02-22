package course.linkflower.link.oneframework.members.model;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("borrow_card")
public class BorrowCard extends Model<BorrowCard> {
    private long id;
    private long clientId;
    private DateTime startDate;
    private DateTime endDate;
    private byte status;
    private byte level;
    private long bookCount;
}
