package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.commission.AddCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.DeleteCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.SearchCommissionDto;
import course.linkflower.link.oneframework.members.dto.commission.UpdateCommissionDto;
import course.linkflower.link.oneframework.members.dto.picture.AddPictureDto;
import course.linkflower.link.oneframework.members.dto.picture.DeletePictureDto;
import course.linkflower.link.oneframework.members.dto.picture.SearchPictureDto;
import course.linkflower.link.oneframework.members.dto.picture.UpdatePictureDto;
import course.linkflower.link.oneframework.members.service.PictureService;
import course.linkflower.link.oneframework.members.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.members.vo.picture.PictureVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/picture")
@RefreshScope
public class PictureController {
    @Autowired
    PictureService pictureService;
    @PostMapping("/add")
    public Result<PictureVo> add(@RequestBody AddPictureDto addPictureDto) {
        return pictureService.addPicture(addPictureDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeletePictureDto deletePictureDto) {
        return pictureService.deletePicture(deletePictureDto);
    }

    @PostMapping("/update")
    public Result<PictureVo> update(@RequestBody UpdatePictureDto updatePictureDto) {
        return pictureService.updatePicture(updatePictureDto);
    }

    @PostMapping("/search")
    public Result<PictureVo> search(@RequestBody SearchPictureDto searchPictureDto) {
        return pictureService.getPictureById(searchPictureDto);
    }
}
