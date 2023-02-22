package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BookInfoMapper extends SuperMapper<BookInfo> {

    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name);

    BookInfo bookInfoSearch(@Param("id") Long id);
}
