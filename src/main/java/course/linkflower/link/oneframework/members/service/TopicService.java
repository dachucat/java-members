package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.members.dto.topic.AddTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.DeleteTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.SearchTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateTopicDto;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;

public interface TopicService {
    TopicVo addTopic (AddTopicDto addTopicDto);
    TopicVo updateTopic(UpdateTopicDto updateTopicDto);
    void deleteTopic (DeleteTopicDto deleteTopicDto);
    TopicVo getTopicById(SearchTopicDto searchTopicDto);
    TopicTreeVo listTopicTreeByCode(String code);
}
