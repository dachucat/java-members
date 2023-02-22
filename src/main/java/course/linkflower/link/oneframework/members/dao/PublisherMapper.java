package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.members.model.Publisher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PublisherMapper extends SuperMapper<Publisher> {
    int save(@Param("bookInfoId") String name);

    int delete(@Param("id") Long id);

    int update(@Param("bookInfoId") String name);
    Publisher publisherSearch (@Param("id") Long id);
}
