package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.model.Park;
import course.linkflower.link.oneframework.members.vo.park.AddParkVo;
import course.linkflower.link.oneframework.members.vo.park.ParkTreeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ParkMapper extends SuperMapper<ParkMapper> {
    List<ParkTreeVo> listParkTreeByCode(CodeDto codeDto);

    int countUrl(@Param("url") String url);

    int add(Park park);

    AddParkVo getParkById(@Param("id") long id);

    int update(Park park);

    int countUrlDiffId(long id);
}
