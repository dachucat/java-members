package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.milkPractice.AuthorDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorMapper extends SuperMapper<AuthorMapper> {
    int addAuthor(AuthorDto authorDto);
}
