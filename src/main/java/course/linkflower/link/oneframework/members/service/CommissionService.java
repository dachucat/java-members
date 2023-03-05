package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.commission.AddCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.DeleteCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.SearchCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.UpdateCommissionDto;
import course.linkflower.link.oneframework.members.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.members.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.members.vo.dictionary.DictionaryVo;

public interface CommissionService {
    Result<CommissionVo> addCommission(AddCommissionDto addCommissionDto);
    Result deleteCommission(DeleteCommissionDto deleteCommissionDto);
    Result<CommissionVo> updateCommission(UpdateCommissionDto updateCommissionDto);
    Result<CommissionVo> getCommissionById(SearchCommissionDto searchCommissionDto);
}
