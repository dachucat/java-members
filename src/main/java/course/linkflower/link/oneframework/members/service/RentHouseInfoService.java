package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.AddRentHouseInfoDto;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.DeleteRentHouseInfoDto;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.SearchRentHouseInfoDto;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.UpdateRentHouseInfoDto;
import course.linkflower.link.oneframework.members.model.RentHouseInfo;
import course.linkflower.link.oneframework.members.vo.renthouseinfo.RentHouseInfoVo;

public interface RentHouseInfoService {
    Result<RentHouseInfoVo> addRentHouseInfo(AddRentHouseInfoDto addRentHouseInfoDto);
    Result deleteRentHouseInfo(DeleteRentHouseInfoDto deleteRentHouseInfoDto);
    Result<RentHouseInfoVo> updateRentHouseInfo(UpdateRentHouseInfoDto updateRentHouseInfoDto);
    Result<RentHouseInfoVo> getRentHouseInfoById(SearchRentHouseInfoDto searchRentHouseInfoDto);
}
