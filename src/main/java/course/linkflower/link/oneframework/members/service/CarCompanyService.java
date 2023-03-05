package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.carcompany.CarCompanyDto;
import course.linkflower.link.oneframework.members.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.members.model.CarCompany;
import course.linkflower.link.oneframework.members.vo.carcompany.CarCompanyNoIdVo;

public interface CarCompanyService {

    Result<CarCompanyNoIdVo> add(CarCompanyNoIdDto carCompanyNoIdDto);

    Result<CarCompanyNoIdVo> update(CarCompanyDto carCompanyDto);

    Result deleteById(IdDto idDto);
}
