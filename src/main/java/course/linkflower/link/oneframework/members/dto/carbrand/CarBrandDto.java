package course.linkflower.link.oneframework.members.dto.carbrand;

import course.linkflower.link.oneframework.members.model.CarBrand;
import lombok.Data;

@Data
public class CarBrandDto {
    private String id;
    private String icon;
    private String name;
    private String carCompanyId;

    public CarBrand toModel(CarBrandDto carBrandDto) {
        CarBrand carBrand=new CarBrand();
        carBrand.setId(Long.parseLong(id));
        carBrand.setCarCompanyId(Long.parseLong(carCompanyId));
        carBrand.setIcon(icon);
        carBrand.setName(name);
        return carBrand;
    }
}
