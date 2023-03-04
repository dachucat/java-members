package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.park.ParkDto;
import course.linkflower.link.oneframework.members.vo.park.ParkTreeVo;
import course.linkflower.link.oneframework.members.vo.park.ParkVo;

public interface ParkService {

    ParkTreeVo ListParkTreeByCodeVo(CodeDto codeDto);

    Result<ParkVo> add(ParkDto parkDto);
}
