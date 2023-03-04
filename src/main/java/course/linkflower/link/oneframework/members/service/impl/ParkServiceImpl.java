package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.common.lang.Lang;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.ParkMapper;
import course.linkflower.link.oneframework.members.dto.park.ParkDto;
import course.linkflower.link.oneframework.members.service.ParkService;
import course.linkflower.link.oneframework.members.vo.park.ParkTreeVo;
import course.linkflower.link.oneframework.members.vo.park.ParkVo;
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

    @Override
    public Result<ParkVo> add(ParkDto parkDto) {
        if (parkDto.getUrl() != null) {
            if (parkMapper.countUrl(parkDto.getUrl())!=0){
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(Lang.T(BaseErrorContst.BaseMsgTimeParamsDuplicateError),"code"));
            }
        }
        parkMapper.add(parkDto.toModel(parkDto));
        return Result.succeed(parkMapper.getParkById(parkDto.toModel(parkDto).getId()));
    }
}
