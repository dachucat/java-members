package course.linkflower.link.oneframework.members.vo.borrowRequest;

import course.linkflower.link.oneframework.members.model.BorrowRequest;
import lombok.Data;

@Data
public class BorrowRequestVo {
    private String id;
    private String bookInfoId;
    private String remark;
    private String clientId;
    private int type;
    private String borrowDate;

    public BorrowRequestVo loadFrom(BorrowRequest borrowRequest){
        if (borrowRequest != null){
            clientId = String.valueOf(borrowRequest.getClientId());
            bookInfoId = String.valueOf(borrowRequest.getBookInfoId());
        }
        return this;
    }
}
