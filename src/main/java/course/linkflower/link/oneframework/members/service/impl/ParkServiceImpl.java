package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.common.lang.Lang;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.ParkMapper;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.park.AddParkDto;
import course.linkflower.link.oneframework.members.dto.park.ParkDto;
import course.linkflower.link.oneframework.members.model.Park;
import course.linkflower.link.oneframework.members.service.ParkService;
import course.linkflower.link.oneframework.members.vo.park.AddParkVo;
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
    public Result<AddParkVo> add(AddParkDto addParkDto) {
        if (addParkDto.getUrl() != null) {
            if (parkMapper.countUrl(addParkDto.getUrl())!=0){
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(Lang.T(BaseErrorContst.BaseMsgTimeParamsDuplicateError),"code"));
            }
        }
        Park park=addParkDto.toModel(addParkDto);
        parkMapper.add(park);
        return Result.succeed(parkMapper.getParkById(park.getId()));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        parkMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<ParkVo> update(ParkDto parkDto) {
        if (parkDto.getUrl()!=null){
            if (parkMapper.countUrlDiffId(Long.parseLong(parkDto.getId()))!=0){
                return Result.of(null,BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(Lang.T(BaseErrorContst.BaseMsgTimeParamsDuplicateError),"date"));
            }
        }
        Park park=parkDto.toModel(parkDto);
        parkMapper.update(park);
        return Result.succeed(new ParkVo().loadFrom(park));
    }
}
