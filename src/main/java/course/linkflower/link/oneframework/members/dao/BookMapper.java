package course.linkflower.link.oneframework.members.dao;

import cn.hutool.core.date.DateTime;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.SearchBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.model.Book;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookMapper extends SuperMapper<Book> {
    int save(@Param("bookinforid") long bookInforId,@Param("inlibrarydate") DateTime inLibraryDate);

    int delete(@Param("id") long id);

    int update(@Param("bookInfoId") long bookInfoId);
    Book bookSearchById(@Param("id") long id);

    Book bookSearchByName(@Param("name") String name);

    List<Book> bookSearch(SearchBookDto id);


}
