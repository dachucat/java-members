package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.park.AddParkDto;
import course.linkflower.link.oneframework.members.dto.park.ParkDto;
import course.linkflower.link.oneframework.members.service.ParkService;
import course.linkflower.link.oneframework.members.vo.park.AddParkVo;
import course.linkflower.link.oneframework.members.vo.park.ParkTreeVo;
import course.linkflower.link.oneframework.members.vo.park.ParkVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/park")
@RefreshScope
public class ParkController {
    @Autowired
    private ParkService parkService;

    @PostMapping("/listParkTreeByCode")
    public Result<ParkTreeVo> listParkTreeByCode(@RequestBody CodeDto codeDto){
        return Result.succeed(parkService.ListParkTreeByCodeVo(codeDto));
    }

    @PostMapping("/add")
    public Result<AddParkVo> add(@RequestBody AddParkDto addParkDto){
        return parkService.add(addParkDto);
    }

    @PostMapping("/update")
    public Result<ParkVo> update(@RequestBody ParkDto parkDto){
        return parkService.update(parkDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(IdDto idDto){
        return parkService.deleteById(idDto);
    }
}
