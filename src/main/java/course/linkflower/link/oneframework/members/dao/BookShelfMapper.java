package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.AddBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.UpdateBookShelfDto;
import course.linkflower.link.oneframework.members.model.Bookshelf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BookShelfMapper extends SuperMapper<Bookshelf> {
    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name);

    Bookshelf bookShelfSearchById(@Param("id") Long id);

    Bookshelf getByBarcode(@Param("barcode") String barcode);

    List<Bookshelf> listByIds(@Param("ids") Collection<Long> ids);
}
