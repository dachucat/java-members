package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.model.Author;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorMapper extends SuperMapper<AuthorMapper> {
    int addAuthor(@Param("name") String name,@Param("phone") String phone, @Param("country") String country, @Param("address") String address, @Param("mail") String mail, @Param("remark") String remark);
    Author getAuthorById(@Param("id") long id);
}
