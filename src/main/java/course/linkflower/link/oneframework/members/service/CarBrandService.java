package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.carbrand.CarBrandDto;
import course.linkflower.link.oneframework.members.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.members.dto.carbrand.NameDto;
import course.linkflower.link.oneframework.members.vo.carbrand.CarBrandNoIdVo;

import java.util.List;

public interface CarBrandService {
    Result<CarBrandNoIdVo> add(CarBrandNoIdDto carBrandNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarBrandNoIdVo> update(CarBrandDto carBrandDto);

    Result<CarBrandNoIdVo> getCarBrandById(IdDto idDto);

    Result<List<CarBrandNoIdVo>> listNameByCarCompanyId(IdDto idDto);
}
