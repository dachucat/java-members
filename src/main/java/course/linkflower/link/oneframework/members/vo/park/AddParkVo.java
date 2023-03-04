package course.linkflower.link.oneframework.members.vo.park;

import lombok.Data;

@Data
public class AddParkVo {
    private String name;
    private String id;
    private String parentId;
    private String icon;
    private String url;
    private String ordering;
    private byte level;
    private String introduction;
    private String barcode;
}
