package course.linkflower.link.oneframework.members.vo.menu;

import course.linkflower.link.oneframework.members.model.Menu;
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
    private String url;
    public MenuVo loadFrom(Menu m){
        if (m!=null){
            name=m.getName();
            parentId=String.valueOf(m.getParentId());
            columnType = m.getColumnType();
            barcode = m.getBarcode();
            description = m.getDescription();
            sortValue = m.getSortValue();
            icon = m.getIcon();
            code = m.getCode();
            url = m.getUrl();
        }
        return this;
    }
}
