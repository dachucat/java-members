package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.AddRentHouseInfoDto;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.DeleteRentHouseInfoDto;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.SearchRentHouseInfoDto;
import course.linkflower.link.oneframework.members.dto.renthouseinfo.UpdateRentHouseInfoDto;
import course.linkflower.link.oneframework.members.vo.dictionary.DictionaryVo;
import course.linkflower.link.oneframework.members.vo.renthouseinfo.RentHouseInfoVo;

public interface DictionaryService {
    Result<DictionaryVo> addDictionary(AddDictionaryDto addDictionaryDto);
    Result deleteDictionary(DeleteDicitionaryDto deleteDicitionaryDto);
    Result<DictionaryVo> updateDictionary(UpdateDicitionaryDto updateDicitionaryDto);
    Result<DictionaryVo> getDictionaryById(SearchDicitionaryDto searchDicitionaryDto);
}
