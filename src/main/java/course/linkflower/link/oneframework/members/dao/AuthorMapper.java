//package course.linkflower.link.oneframework.members.dao;
//
//import course.linkflower.link.oneframework.db.mapper.SuperMapper;
//import course.linkflower.link.oneframework.members.model.Author;
//import course.linkflower.link.oneframework.members.model.Member;
//import course.linkflower.link.oneframework.members.model.SysRoleMenu;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
//@Mapper
//public interface AuthorMapper extends SuperMapper<Author> {
//    long saveAuthor(@Param("authorname") String name, @Param("authorbirth") long birth);
//    int deleteAuthor(@Param("authorid") long id);
//    Author getAuthorId(@Param("authorid") long id);
//    Author getAuthorName(@Param("authorname") String name);
//    List<Author> listAuthor();
//}
