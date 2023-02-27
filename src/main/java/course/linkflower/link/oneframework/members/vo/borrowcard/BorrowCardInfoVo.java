package course.linkflower.link.oneframework.members.vo.borrowcard;

import course.linkflower.link.oneframework.members.model.BorrowCard;
import lombok.Data;

import java.util.Date;

@Data
public class BorrowCardInfoVo {
    private String id;
    private String clientId;
    private String barcode;
    private String startDate;
    private String endDate;
    public BorrowCardInfoVo loadFrom(BorrowCard b){
        if(b!=null){
            id = String.valueOf(b.getId());
            clientId = String.valueOf(b.getClientId());
            startDate = b.getStartDate();
        }
        return this;
    }
}
