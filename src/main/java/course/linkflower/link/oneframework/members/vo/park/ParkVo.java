package course.linkflower.link.oneframework.members.vo.park;

import course.linkflower.link.oneframework.members.model.Park;
import lombok.Data;

@Data
public class ParkVo {
    private String name;
    private String id;
    private String parentId;
    private String icon;
    private String url;
    private String ordering;
    private byte level;
    private String introduction;
    private String barcode;

    public ParkVo loadFrom(Park park){
        name=park.getName();
        id=String.valueOf(park.getId());
        if (park.getParentId()==null)
            parentId=null;
        else
            parentId=String.valueOf(park.getParentId());
        icon=park.getIcon();
        url=park.getUrl();
        if (park.getOrdering()==null)
            ordering=null;
        else ordering=String.valueOf(park.getOrdering());
        level=park.getLevel();
        introduction=park.getIntroduction();
        barcode=park.getBarcode();
        return this;
    }
}
