package course.linkflower.link.oneframework.members.vo.clientwallet;

import course.linkflower.link.oneframework.members.model.Client;
import course.linkflower.link.oneframework.members.model.ClientWallet;
import lombok.Data;

import java.util.Date;

@Data
public class ClientWalletVo {
    private String id;
    private String clientId;
    private String amount;
    private Date lastDeposit;

}
