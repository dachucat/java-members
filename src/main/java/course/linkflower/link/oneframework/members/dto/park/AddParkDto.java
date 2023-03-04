package course.linkflower.link.oneframework.members.dto.park;

import course.linkflower.link.oneframework.members.model.Park;
import lombok.Data;

@Data
public class AddParkDto {
    private String name;
    private String parentId;
    private String icon;
    private String url;
    private String ordering;
    private byte level;
    private String introduction;
    private String barcode;

    public Park toModel(AddParkDto addParkDto) {
        Park park=new Park();
        park.setName(name);
        if (parentId==null)
            park.setParentId(null);
        else
            park.setParentId(Long.valueOf(parentId));
        park.setIcon(icon);
        park.setUrl(url);
        if (ordering==null)
            park.setOrdering(null);
        else
            park.setOrdering(Long.valueOf(ordering));
        park.setLevel(level);
        park.setIntroduction(introduction);
        park.setBarcode(barcode);
        return park;
    }
}
