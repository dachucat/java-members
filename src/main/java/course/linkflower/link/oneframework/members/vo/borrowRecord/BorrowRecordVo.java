package course.linkflower.link.oneframework.members.vo.borrowRecord;

import course.linkflower.link.oneframework.members.model.BorrowRecord;
import lombok.Data;

@Data
public class BorrowRecordVo {
    private long id;
    private long clientId;
    private long borrowCardId;
    private int status;
    private String startDate;
    private String endDate;
    private String remark;

    public BorrowRecordVo loadFrom(BorrowRecord borrowRecord){
        if (borrowRecord != null){
            clientId = borrowRecord.getClientId();
            startDate = borrowRecord.getStartDate();
            endDate = borrowRecord.getEndDate();
        }
        return  this;
    }
}
