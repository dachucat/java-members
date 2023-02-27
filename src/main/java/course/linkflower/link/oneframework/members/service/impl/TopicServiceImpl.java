package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.TopicMapper;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.topic.AddDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateDto;
import course.linkflower.link.oneframework.members.model.Topic;
import course.linkflower.link.oneframework.members.service.TopicService;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicMapper topicMapper;

    @Override
    public TopicVo getTopicById(IdDto idDto) {
        return topicMapper.getTopicById(Long.parseLong(idDto.getId()));
    }

    @Override
    public TopicVo add(AddDto addDto) {
        Topic top = addDto.toModel(addDto);
        topicMapper.add(top);
        return topicMapper.getTopicById(top.getId());
    }

    @Override
    public int deleteById(IdDto idDto) {
        return topicMapper.deleteById(Long.parseLong(idDto.getId()));
    }

    @Override
    public TopicVo update(UpdateDto updateDto) {
        topicMapper.update(updateDto.toModel(updateDto));
        return topicMapper.getTopicById(Long.parseLong(updateDto.getId()));
    }


    @Override
    public TopicTreeVo listTopicTreeByCode(String code) {
        List<TopicTreeVo> topics = topicMapper.listTopicTreeByParentCode(code);
        return TopicTreeVo.loadFromList(topics);
    }
}
