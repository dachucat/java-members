package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.members.vo.menu.MenuTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<MenuTreeVo> listMenuTreeByParentCode(@Param("code") String code);
}
