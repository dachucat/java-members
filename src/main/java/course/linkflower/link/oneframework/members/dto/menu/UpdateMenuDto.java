package course.linkflower.link.oneframework.members.dto.menu;

import course.linkflower.link.oneframework.members.model.Menu;
import lombok.Data;

@Data
public class UpdateMenuDto {
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
    public Menu toModel(){
        Menu m = new Menu();
        m.setId(Long.parseLong(id));
        m.setName(name);
        if(parentId!=null){
            m.setParentId(Long.parseLong(parentId));
        }
        m.setColumnType(columnType);
        m.setBarcode(barcode);
        m.setDescription(description);
        m.setSortValue(sortValue);
        m.setIcon(icon);
        m.setCode(code);
        m.setUrl(url);

        return m;
    }
}
