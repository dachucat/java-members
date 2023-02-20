package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.PutawayBookDto;
import org.apache.ibatis.annotations.Mapper;

import java.awt.print.Book;

@Mapper
public interface BookMapper extends SuperMapper<BookMapper> {
    int addBook(PutawayBookDto putawayDto);
}
