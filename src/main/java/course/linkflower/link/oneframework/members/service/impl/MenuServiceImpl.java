package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.MenuMapper;
import course.linkflower.link.oneframework.members.service.MenuService;
import course.linkflower.link.oneframework.members.vo.menu.MenuTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public MenuTreeVo listMenuTreeByCode(String code) {
        List<MenuTreeVo> topics = menuMapper.listMenuTreeByParentCode(code);
        return MenuTreeVo.loadFromList(topics);
    }
}
