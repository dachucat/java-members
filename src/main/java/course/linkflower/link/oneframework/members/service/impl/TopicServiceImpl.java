package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.lang.Lang;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.TopicMapper;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.topic.AddTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.DeleteTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.SearchTopicDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateTopicDto;
import course.linkflower.link.oneframework.members.model.Topic;
import course.linkflower.link.oneframework.members.service.TopicService;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;
import net.sf.jsqlparser.statement.select.Top;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    TopicMapper topicMapper;

    @Override
    public Result<TopicVo> addTopic(AddTopicDto addTopicDto) {
        Topic t = addTopicDto.toModel();
        if (t.getCode() != null) {
            if (topicMapper.countByCode(t.getCode()) != 0) {
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(Lang.T(BaseErrorContst.BaseMsgTimeParamsDuplicateError), "code"));
            }
        }
        topicMapper.save(t);
        return Result.succeed(new TopicVo().loadFrom(t));
    }

    @Override
    public Result<TopicVo> updateTopic(@Validated UpdateTopicDto updateTopicDto) {
        Topic t = updateTopicDto.toModel();
        if (t.getCode() != null) {
            if (topicMapper.countByCodeAndId(t.getCode(), t.getId()) != 0) {
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(Lang.T(BaseErrorContst.BaseMsgTimeParamsDuplicateError), "code"));
            }
        }
        topicMapper.update(t);
        return Result.succeed(new TopicVo().loadFrom(t));
    }

    @Override
    public Result deleteTopic(DeleteTopicDto deleteTopicDto) {
        topicMapper.delete(Long.parseLong(deleteTopicDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<TopicVo> getTopicById(long id) {
        return Result.succeed(getTopicByIdIn(id));
    }

    @Override
    public TopicVo getTopicByIdIn(long id) {
        return new TopicVo().loadFrom(topicMapper.getTopicById(id));
    }

    @Override
    public Result<TopicTreeVo> listTopicTreeByCode(String code) {
        List<TopicTreeVo> topics = topicMapper.listTopicTreeByParentCode(code);
        return Result.succeed(TopicTreeVo.loadFromList(topics));
    }
}