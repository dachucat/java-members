package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.members.model.Dictionary;
import course.linkflower.link.oneframework.members.model.RentHouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DictionaryMapper {
    int save (Dictionary dictionary);
    int delete(@Param("id") long id);
    int update(Dictionary dictionary);
    Dictionary getDictionaryById(@Param("id") long id);
}
