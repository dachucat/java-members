package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.model.BookInfo;
import course.linkflower.link.oneframework.members.vo.book.BookVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Mapper
public interface BookInfoMapper extends SuperMapper<BookInfo> {

    BookVo getDetailById(@Param("id") long id);
    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name);

    BookInfo bookInfoSearchById(@Param("id") Long id);

    BookInfo getBookByBarcode(@Param("barcode") String barcode);

    List<BookInfo> listByIds(@Param("ids") Collection<Long> ids);

}
