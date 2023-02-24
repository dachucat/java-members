package course.linkflower.link.oneframework.members.model;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("client_wallet")
public class ClientWallet {
    private long id;
    private long clientId;
    private float amount;
    private DateTime lastDepositDate;
}
