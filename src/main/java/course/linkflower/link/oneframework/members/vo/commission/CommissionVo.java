package course.linkflower.link.oneframework.members.vo.commission;

import course.linkflower.link.oneframework.members.model.Commission;
import lombok.Data;

@Data
public class CommissionVo {
    private  String id;
    private String type;
    private String value;

    public CommissionVo loadFrom(Commission commission) {
        if (commission != null) {
            id = String.valueOf(commission.getId());
            type=commission.getType();
            value=commission.getValue();
        }

        return this;
    }
}
