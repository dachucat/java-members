package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.members.model.Commission;
import course.linkflower.link.oneframework.members.model.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PictureMapper {
    int save (Picture picture);
    int delete(@Param("id") long id);
    int update(Picture picture);
    Picture getPictureById(@Param("id") long id);
}
