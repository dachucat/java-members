package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.members.dao.ParkMapper;
import course.linkflower.link.oneframework.members.service.ParkService;
import course.linkflower.link.oneframework.members.vo.park.ParkTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkServiceImpl implements ParkService {
    @Autowired
    private ParkMapper parkMapper;

    @Override
    public ParkTreeVo ListParkTreeByCodeVo(CodeDto codeDto) {
        List<ParkTreeVo> ptVos = parkMapper.listParkTreeByCode(codeDto);
        return ParkTreeVo.loadFromList(ptVos);
    }
}
