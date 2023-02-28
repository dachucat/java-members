package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.CodeDto;
import course.linkflower.link.oneframework.members.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.members.dto.topic.AddTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.DeleteTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.SearchTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateTopicDto;
import course.linkflower.link.oneframework.members.service.TopicService;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/topic")
@RefreshScope
public class TopicController {
    @Autowired
    TopicService topicService;
    @PostMapping("/add")
    public Result<TopicVo> add(@Validated @RequestBody AddTopicDto addTopicDto) {
        return topicService.addTopic(addTopicDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteTopicDto deleteTopicDto) {
        return topicService.deleteTopic(deleteTopicDto);
    }

    @PostMapping("/update")
    public Result<TopicVo> update(@RequestBody UpdateTopicDto updateTopicDto) {
        return topicService.updateTopic(updateTopicDto);
    }

    @PostMapping("/search")
    public Result<TopicVo> search(@RequestBody SearchTopicDto searchTopicDto) {
        return topicService.getTopicById(Long.parseLong(searchTopicDto.getId()));
    }
    @PostMapping("/listTopicTreeByCode")
    public Result<TopicTreeVo> listTopicTreeByCode(@RequestBody CodeDto codeDto){
        return topicService.listTopicTreeByCode(codeDto.getCode());
    }
}
