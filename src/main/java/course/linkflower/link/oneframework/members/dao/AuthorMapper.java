package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.members.model.Author;
import course.linkflower.link.oneframework.members.vo.author.AuthorVo;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorMapper extends SuperMapper<AuthorMapper> {
    int addAuthor(AddAuthorDto addAuthorDto);
    AuthorVo getAuthorById(@Param("id") long id);
    int updateAuthor(Author author);
    int deleteAuthorById(@Param("id") long id);
}
