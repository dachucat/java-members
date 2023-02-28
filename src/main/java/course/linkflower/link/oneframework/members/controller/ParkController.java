package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.service.ParkService;
import course.linkflower.link.oneframework.members.vo.park.ParkTreeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
}
