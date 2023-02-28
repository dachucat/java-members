package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.CodeDto;
import course.linkflower.link.oneframework.members.service.MenuService;
import course.linkflower.link.oneframework.members.vo.menu.MenuTreeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/menu")
@RefreshScope
public class MenuController {
    @Autowired
    MenuService menuService;
    @PostMapping("/listMenuTreeByCode")
    public Result<MenuTreeVo> listMenuTreeByCode (CodeDto codeDto){
       return Result.succeed(menuService.listMenuTreeByCode(codeDto.getCode())) ;
    }
}
