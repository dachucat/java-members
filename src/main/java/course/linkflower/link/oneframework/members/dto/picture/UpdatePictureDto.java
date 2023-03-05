package course.linkflower.link.oneframework.members.dto.picture;

import course.linkflower.link.oneframework.members.model.Picture;
import lombok.Data;

@Data
public class UpdatePictureDto {
    private String id;
    private String rentHouseInfoId;
    private String type;
    private String name;
    private String url;

    public Picture toModel(){
        Picture picture = new Picture();
        picture.setId(Long.parseLong(id));
        if (rentHouseInfoId!=null){
            picture.setRentHouseInfoId(Long.parseLong(rentHouseInfoId));
        }
        picture.setType(type);
        picture.setName(name);
        picture.setUrl(url);
    return picture;
    }
}
