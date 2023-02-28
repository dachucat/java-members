package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.vo.menu.MenuTreeVo;

public interface MenuService {
    MenuTreeVo listMenuTreeByCode(String code);
}
