package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.members.model.BookType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BookTypeMapper extends SuperMapper<BookType> {
    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name);
    BookType bookTypeSearchById (@Param("id") Long id);
}
