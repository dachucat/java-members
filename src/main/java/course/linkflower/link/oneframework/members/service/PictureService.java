package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.members.dto.picture.AddPictureDto;
import course.linkflower.link.oneframework.members.dto.picture.DeletePictureDto;
import course.linkflower.link.oneframework.members.dto.picture.SearchPictureDto;
import course.linkflower.link.oneframework.members.dto.picture.UpdatePictureDto;
import course.linkflower.link.oneframework.members.vo.dictionary.DictionaryVo;
import course.linkflower.link.oneframework.members.vo.picture.PictureVo;

public interface PictureService {
    Result<PictureVo> addPicture(AddPictureDto addPictureDto);
    Result deletePicture(DeletePictureDto deletePictureDto);
    Result<PictureVo> updatePicture(UpdatePictureDto updatePictureDto);
    Result<PictureVo> getPictureById(SearchPictureDto searchPictureDto);
}
