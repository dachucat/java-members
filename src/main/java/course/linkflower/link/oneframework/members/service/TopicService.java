package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.controller.Topic;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.topic.AddDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateDto;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;

import java.util.List;

public interface TopicService {
    TopicVo getTopicById(IdDto idDto);

    TopicVo add(AddDto addDto);

    int deleteById(IdDto idDto);

    TopicVo update(UpdateDto updateDto);

    TopicTreeVo listTopicTreeByCode(String code);
}
