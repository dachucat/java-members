package course.linkflower.link.oneframework.members.dto.commission;

import course.linkflower.link.oneframework.members.model.Commission;
import lombok.Data;

@Data
public class AddCommissionDto {
    private String type;
    private String value;

    public Commission toModel(){
        Commission commission = new Commission();
        commission.setType(type);
        commission.setValue(value);
        return commission;
    }
}
