package course.linkflower.link.oneframework.members.dto.picture;

import course.linkflower.link.oneframework.members.model.Picture;
import lombok.Data;

@Data
public class AddPictureDto {

    private String rentHouseInfoId;
    private String type;
    private String name;
    private String url;

    public Picture toModel(){
        Picture picture = new Picture();
        if (rentHouseInfoId!=null){
            picture.setRentHouseInfoId(Long.parseLong(rentHouseInfoId));
        }
        picture.setType(type);
        picture.setName(name);
        picture.setUrl(url);
        return picture;
    }
}
