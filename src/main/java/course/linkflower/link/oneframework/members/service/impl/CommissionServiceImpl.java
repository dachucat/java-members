package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.CommissionMapper;
import course.linkflower.link.oneframework.members.dto.commission.AddCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.DeleteCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.SearchCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.UpdateCommissionDto;
import course.linkflower.link.oneframework.members.model.Commission;
import course.linkflower.link.oneframework.members.service.CommissionService;
import course.linkflower.link.oneframework.members.vo.commission.CommissionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommissionServiceImpl implements CommissionService {
    @Autowired
    CommissionMapper commissionMapper;

    @Override
    public Result<CommissionVo> addCommission(AddCommissionDto addCommissionDto) {
        Commission commission = addCommissionDto.toModel();
        commissionMapper.save(commission);
        return Result.succeed(new CommissionVo().loadFrom(commission));
    }

    @Override
    public Result deleteCommission(DeleteCommissionDto deleteCommissionDto) {
        commissionMapper.delete(Long.parseLong(deleteCommissionDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<CommissionVo> updateCommission(UpdateCommissionDto updateCommissionDto) {
        Commission commission = updateCommissionDto.toModel();
        commissionMapper.save(commission);
        return Result.succeed(new CommissionVo().loadFrom(commission));
    }

    @Override
    public Result<CommissionVo> getCommissionById(SearchCommissionDto searchCommissionDto) {
        return Result.succeed(new CommissionVo().loadFrom(commissionMapper.getCommissionById(Long.parseLong(searchCommissionDto.getId()))));
    }
}
