package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.model.ThirdAuth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ThirdAuthMapper extends SuperMapper<ThirdAuth> {
    int save(@Param("clientId") Long clientId ,@Param("authType") int authType);

    int delete(@Param("id") Long id);

    int update(@Param("authType") int authType);

    ThirdAuth thirdAuthSearchById (@Param("id") Long id);
}
