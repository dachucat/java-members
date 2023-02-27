package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.TopicMapper;
import course.linkflower.link.oneframework.members.dto.topic.AddTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.DeleteTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.SearchTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateTopicDto;
import course.linkflower.link.oneframework.members.model.Topic;
import course.linkflower.link.oneframework.members.service.TopicService;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;
import net.sf.jsqlparser.statement.select.Top;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    TopicMapper topicMapper;

    @Override
    public TopicVo addTopic(AddTopicDto addTopicDto) {
        Topic t = addTopicDto.toModel();
        topicMapper.save(t);
        return new TopicVo().loadFrom(t);
    }

    @Override
    public TopicVo updateTopic(UpdateTopicDto updateTopicDto) {
        Topic t = updateTopicDto.toModel();
        topicMapper.update(t);
        return new TopicVo().loadFrom(t);
    }

    @Override
    public void deleteTopic(DeleteTopicDto deleteTopicDto) {
        topicMapper.delete(Long.parseLong(deleteTopicDto.getId()));
    }

    @Override
    public TopicVo getTopicById(SearchTopicDto searchTopicDto) {
        return new TopicVo().loadFrom(topicMapper.getTopicById(Long.parseLong(searchTopicDto.getId())));
    }
}