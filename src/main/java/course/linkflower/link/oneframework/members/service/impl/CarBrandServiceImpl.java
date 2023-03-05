package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.CarBrandMapper;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.carbrand.CarBrandDto;
import course.linkflower.link.oneframework.members.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.members.dto.carbrand.NameDto;
import course.linkflower.link.oneframework.members.model.CarBrand;
import course.linkflower.link.oneframework.members.service.CarBrandService;
import course.linkflower.link.oneframework.members.vo.carbrand.CarBrandNoIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarBrandServiceImpl implements CarBrandService {
    @Autowired
    private CarBrandMapper carBrandMapper;

    @Override
    public Result<CarBrandNoIdVo> add(CarBrandNoIdDto carBrandNoIdDto) {
        if (carBrandMapper.countSameIcon(carBrandNoIdDto.getIcon())!=0){
             long id=carBrandMapper.getIdByIcon(carBrandNoIdDto.getIcon());
             if (carBrandMapper.getNameById(id)==carBrandNoIdDto.getName()){
                    if (carBrandMapper.getCarCompanyIdById(id)==Long.parseLong(carBrandNoIdDto.getCarCompanyId())){
                        Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                                String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,
                                        "carCompanyId and  name and icon"));
                    }
             }
        }
        CarBrand carBrand=carBrandNoIdDto.toModel(carBrandNoIdDto);
        carBrandMapper.add(carBrand);
        return Result.succeed(new CarBrandNoIdVo().loadFrom(carBrand));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carBrandMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<List<CarBrandNoIdVo>> listNameByCarCompanyId(IdDto idDto) {
        return Result.succeed(carBrandMapper.listNameByCarCompanyId(Long.parseLong(idDto.getId())));
    }

    @Override
    public Result<CarBrandNoIdVo> getCarBrandById(IdDto idDto) {
        return Result.succeed(carBrandMapper.getCarBrandById(Long.parseLong(idDto.getId())));

    }

    @Override
    public Result<CarBrandNoIdVo> update(CarBrandDto carBrandDto) {
        CarBrand carBrand=carBrandDto.toModel(carBrandDto);
        carBrandMapper.update(carBrand);
        return Result.succeed(new CarBrandNoIdVo().loadFrom(carBrand));
    }
}
