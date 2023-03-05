package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.commission.AddCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.DeleteCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.SearchCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.UpdateCommissionDto;
import course.linkflower.link.oneframework.members.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.members.service.CommissionService;
import course.linkflower.link.oneframework.members.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.members.vo.dictionary.DictionaryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/commission")
@RefreshScope
public class CommissionController {
    @Autowired
    CommissionService commissionService;
    @PostMapping("/add")
    public Result<CommissionVo> add(@RequestBody AddCommissionDto addCommissionDto) {
        return commissionService.addCommission(addCommissionDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteCommissionDto deleteCommissionDto) {
        return commissionService.deleteCommission(deleteCommissionDto);
    }

    @PostMapping("/update")
    public Result<CommissionVo> update(@RequestBody UpdateCommissionDto updateCommissionDto) {
        return commissionService.updateCommission(updateCommissionDto);
    }

    @PostMapping("/search")
    public Result<CommissionVo> search(@RequestBody SearchCommissionDto searchCommissionDto) {
        return commissionService.getCommissionById(searchCommissionDto);
    }
}
