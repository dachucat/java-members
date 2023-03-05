package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.CodeDto;
import course.linkflower.link.oneframework.members.dto.menu.AddMenuDto;
import course.linkflower.link.oneframework.members.dto.menu.DeleteMenuDto;
import course.linkflower.link.oneframework.members.dto.menu.SearchMenuDto;
import course.linkflower.link.oneframework.members.dto.menu.UpdateMenuDto;
import course.linkflower.link.oneframework.members.vo.menu.MenuTreeVo;
import course.linkflower.link.oneframework.members.vo.menu.MenuVo;

import java.util.List;

public interface MenuService {
    Result<MenuVo> addMenu(AddMenuDto addMenuDto);
    Result<MenuVo> updateMenu(UpdateMenuDto updateMenuDto);
    Result deleteMenu(DeleteMenuDto deleteMenuDto);
    Result<MenuVo> getMenuById(SearchMenuDto searchMenuDto);
    Result<MenuTreeVo> listMenuTreeByCode(String code);
}
