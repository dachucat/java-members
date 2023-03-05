package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.members.model.Commission;
import course.linkflower.link.oneframework.members.model.Dictionary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommissionMapper {
    int save (Commission commission);
    int delete(@Param("id") long id);
    int update(Commission commission);
    Commission getCommissionById(@Param("id") long id);
}
