package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.DictionaryMapper;
import course.linkflower.link.oneframework.members.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.members.model.Dictionary;
import course.linkflower.link.oneframework.members.service.DictionaryService;
import course.linkflower.link.oneframework.members.vo.dictionary.DictionaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    DictionaryMapper dictionaryMapper;

    @Override
    public Result<DictionaryVo> addDictionary(AddDictionaryDto addDictionaryDto) {
       Dictionary dictionary =  addDictionaryDto.toModel();
       dictionaryMapper.save(dictionary);
       return Result.succeed(new DictionaryVo().loadFrom(dictionary));
    }

    @Override
    public Result deleteDictionary(DeleteDicitionaryDto deleteDicitionaryDto) {
        dictionaryMapper.delete(Long.parseLong(deleteDicitionaryDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<DictionaryVo> updateDictionary(UpdateDicitionaryDto updateDicitionaryDto) {
        Dictionary dictionary = updateDicitionaryDto.toModel();
        dictionaryMapper.update(dictionary);
        return Result.succeed(new DictionaryVo().loadFrom(dictionary));
    }

    @Override
    public Result<DictionaryVo> getDictionaryById(SearchDicitionaryDto searchDicitionaryDto) {
        return Result.succeed(new DictionaryVo().loadFrom(dictionaryMapper.getDictionaryById(Long.parseLong(searchDicitionaryDto.getId()))));
    }
}
