package course.linkflower.link.oneframework.members.dto.carcompany;

import course.linkflower.link.oneframework.members.model.CarCompany;
import lombok.Data;

@Data
public class CarCompanyNoIdDto {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String icon;

    public CarCompany toModel(CarCompanyNoIdDto carCompanyNoIdDto) {
        CarCompany carCompany=new CarCompany();
        carCompany.setAddress(address);
        carCompany.setEmail(email);
        carCompany.setIcon(icon);
        carCompany.setName(name);
        carCompany.setPhone(phone);
        return carCompany;
    }
}
