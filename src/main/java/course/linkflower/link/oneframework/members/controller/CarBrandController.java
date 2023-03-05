package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.carbrand.CarBrandDto;
import course.linkflower.link.oneframework.members.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.members.dto.carbrand.NameDto;
import course.linkflower.link.oneframework.members.service.CarBrandService;
import course.linkflower.link.oneframework.members.vo.carbrand.CarBrandNoIdVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/carBrand")
@RefreshScope
public class CarBrandController {

    @Autowired
    private CarBrandService carBrandService;

    @PostMapping("/add")
    public Result<CarBrandNoIdVo> add(@RequestBody CarBrandNoIdDto carBrandNoIdDto){
        return carBrandService.add(carBrandNoIdDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return carBrandService.deleteById(idDto);
    }

    @PostMapping("/update")
    public Result<CarBrandNoIdVo> update(@RequestBody CarBrandDto carBrandDto){
        return carBrandService.update(carBrandDto);
    }

    @PostMapping("/getCarBrandById")
    public Result<CarBrandNoIdVo> getCarBrandById(@RequestBody IdDto idDto){
        return carBrandService.getCarBrandById(idDto);
    }

    @PostMapping("/listNameByCarCompanyId")
    public Result<List<CarBrandNoIdVo>> listNameByCarCompanyId(@RequestBody IdDto idDto){
        return carBrandService.listNameByCarCompanyId(idDto);
    }
}
