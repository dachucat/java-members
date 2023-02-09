package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.model.SysRoleMenu;
import course.linkflower.link.oneframework.members.service.SysRoleMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
    Spring  (全家桶)
    Spring boot (完整底层 / 上层都有的框架)
    Spring web  （web 应用， REST）
    Spring cloud    （Spring boot， ）
 */
@RestController
@Slf4j
@RequestMapping("/members")
@RefreshScope
public class MembersController {
    /*
        mvc: model/dao -> service -> controller
     */
    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    /*
    测试是否登陆
     */
    @DeleteMapping("/isLogin")
    public boolean isLogin() {
        return false;
    }

    @GetMapping("getAllMenus")
    public List<SysRoleMenu> getAllMenus() {
        return sysRoleMenuService.getAllMenus();
    }

    232332
}
