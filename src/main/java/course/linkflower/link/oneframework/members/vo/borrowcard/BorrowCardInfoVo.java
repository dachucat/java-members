package course.linkflower.link.oneframework.members.vo.borrowcard;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowCardInfoVo {
    private String id;
    private String clientId;
    private String barcode;
    private Date startDate;
    private Date endDate;
}
