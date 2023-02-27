package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.topic.AddDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateDto;
import course.linkflower.link.oneframework.members.service.TopicService;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/topic")
@RefreshScope
public class Topic {
    @Autowired
    private TopicService topicService;

    @PostMapping("/getTopicById")
    public Result<TopicVo> getTopicById(@RequestBody IdDto idDto){
        return Result.succeed(topicService.getTopicById(idDto));
    }

    @PostMapping("/add")
    public Result<TopicVo> add(@RequestBody AddDto addDto){
        return Result.succeed(topicService.add(addDto));
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        topicService.deleteById(idDto);
        return Result.succeed();
    }

    @PostMapping("/update")
    public Result<TopicVo> update(@RequestBody UpdateDto updateDto){
        return Result.succeed(topicService.update(updateDto));
    }

    @PostMapping("/listTopicTreeByCode")
    public Result<TopicTreeVo> listTopicTreeByCode(@RequestBody CodeDto codeDto){
        return Result.succeed(topicService.listTopicTreeByCode(codeDto.getCode()));
    }
}
