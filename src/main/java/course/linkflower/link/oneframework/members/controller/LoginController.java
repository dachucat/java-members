//package course.linkflower.link.oneframework.members.controller;
//
//import course.linkflower.link.oneframework.members.dto.login.ChangePasswordDto;
//import course.linkflower.link.oneframework.members.model.SysRoleMenu;
//import course.linkflower.link.oneframework.members.service.SysRoleMenuService;
//import course.linkflower.link.oneframework.members.vo.UserInfoVo;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@Slf4j
//@RequestMapping("/members")
//@RefreshScope
//public class LoginController {
//    /*
//        mvc: model/dao -> service -> controller
//     */
//    @Autowired
//    private SysRoleMenuService sysRoleMenuService;
//
//    /*
//    测试是否登陆
//     */
//    @DeleteMapping("/isLogin")
//    public boolean isLogin() {
//        return false;
//    }
//
//    @GetMapping("/getAllMenus")
//    public List<SysRoleMenu> getAllMenus() {
//        return sysRoleMenuService.getAllMenus();
//    }
//
//    @PostMapping("/login")
//    public UserInfoVo login() {
//        return new UserInfoVo();
//    }
//
//    @PostMapping("/changePassword")
//    public void changePassword(@RequestBody ChangePasswordDto memberDto) {
//    }
//}
