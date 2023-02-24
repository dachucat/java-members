package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.PublisherMapper;
import course.linkflower.link.oneframework.members.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.DeleteBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.SearchBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.members.service.PublisherService;
import course.linkflower.link.oneframework.members.vo.borrowRequest.BorrowRequestVo;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/publisher")
@RefreshScope
public class Publisher  {
    @Autowired
    PublisherService publisherService;
    @PostMapping("/add")
    public Result add(@RequestBody AddPublisherDto addPublisherDto) {
        publisherService.addPublisher(addPublisherDto);
        return Result.succeed();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeletePublisherDto deletePublisherDto) {
        publisherService.deletePublisher(deletePublisherDto);
        return Result.succeed();
    }

    @PostMapping("/update")
    public Result update(@RequestBody UpdatePublisherDto updatePublisherDto) {
        publisherService.updatePublisher(updatePublisherDto);
        return Result.succeed();
    }

    @PostMapping("/search")
    public PublisherVo search(@RequestBody SearchPublisherDto searchPublisherDto) {
        return publisherService.getPublisherById(searchPublisherDto);
    }
}
