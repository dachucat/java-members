package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.members.vo.park.ParkTreeVo;

public interface ParkService {

    ParkTreeVo ListParkTreeByCodeVo(CodeDto codeDto);
}
