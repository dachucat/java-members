package course.linkflower.link.oneframework.members.vo.menu;

import lombok.Data;

import java.awt.*;

@Data
public class MenuVo {
    private String id;
    private String name;
    private String parentId;
    private int columnType;
    private String barcode;
    private String description;
    private int sortValue;
    private String icon;
    private String code;
    public MenuVo loadFrom(Menu m){
        return this;
    }
}
