//package course.linkflower.link.oneframework.members.dao;
//
//import course.linkflower.link.oneframework.db.mapper.SuperMapper;
//import course.linkflower.link.oneframework.members.model.SysRoleMenu;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//@Mapper
//public interface SysHeroInfoMapper extends SuperMapper<SysRoleMenu> {
//    @Insert("insert into sys_role_menu(heronum, skillnum) values(#{heroNum}, #{skillNum})")
//    int save(@Param("heroNum") Long heroNum, @Param("skillNum") Long skillNum);
//
//    int delete(@Param("heroNum") Long heroNum, @Param("skillNum") Long skillNum);
//    List<SysRoleMenu> listAllMenus();
//
//}
