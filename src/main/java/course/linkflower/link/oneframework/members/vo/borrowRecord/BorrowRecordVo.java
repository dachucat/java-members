package course.linkflower.link.oneframework.members.vo.borrowRecord;

import course.linkflower.link.oneframework.members.model.BorrowRecord;
import lombok.Data;

@Data
public class BorrowRecordVo {
    private String id;
    private String clientId;
    private String borrowCardId;
    private int status;
    private String startDate;
    private String endDate;
    private String remark;

    public BorrowRecordVo loadFrom(BorrowRecord borrowRecord){
        if (borrowRecord != null){
            clientId = String.valueOf(borrowRecord.getClientId());
            startDate = borrowRecord.getStartDate();
            endDate = borrowRecord.getEndDate();
        }
        return  this;
    }
}
