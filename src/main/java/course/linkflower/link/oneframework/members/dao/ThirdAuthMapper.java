package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.ThirdAuth.AddThirdAuthDto;
import course.linkflower.link.oneframework.members.dto.ThirdAuth.UpdateThirdAuthDto;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.model.ThirdAuth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ThirdAuthMapper extends SuperMapper<ThirdAuth> {
    int save(@Param("clientId") Long clientId ,@Param("authType") int authType);

    int delete(@Param("id") Long id);

    int update(@Param("authType") int authType);

    ThirdAuth thirdAuthSearch (@Param("id") Long id);
}
