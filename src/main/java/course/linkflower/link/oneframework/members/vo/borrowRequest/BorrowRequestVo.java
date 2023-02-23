package course.linkflower.link.oneframework.members.vo.borrowRequest;

import course.linkflower.link.oneframework.members.model.BorrowRequest;
import lombok.Data;

@Data
public class BorrowRequestVo {
    private long id;
    private long bookInfoId;
    private String remark;
    private long clientId;
    private int type;
    private String borrowDate;

    public BorrowRequestVo loadFrom(BorrowRequest borrowRequest){
        if (borrowRequest != null){
            clientId = borrowRequest.getClientId();
            bookInfoId = borrowRequest.getBookInfoId();
        }
        return this;
    }
}
