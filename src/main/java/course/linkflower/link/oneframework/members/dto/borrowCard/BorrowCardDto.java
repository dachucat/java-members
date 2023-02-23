package course.linkflower.link.oneframework.members.dto.borrowCard;

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
public class BorrowCardDto {
    private long id;
    private long clientId;
    private DateTime startDate;
    private DateTime endDate;
    private byte status;
    private byte level;
    private long bookCount;
}
