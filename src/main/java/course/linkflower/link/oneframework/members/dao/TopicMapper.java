package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.topic.AddDto;
import course.linkflower.link.oneframework.members.dto.topic.UpdateDto;
import course.linkflower.link.oneframework.members.model.Topic;
import course.linkflower.link.oneframework.members.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.members.vo.topic.TopicVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TopicMapper extends SuperMapper<TopicMapper> {
    TopicVo getTopicById(@Param("id") long id);
    int add(Topic topic);
    int deleteById(@Param("id") long id);
    int update(Topic topic);

    List<TopicTreeVo> listTopicTreeByParentCode(@Param("code") String code);

}
