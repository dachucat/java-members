package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.members.model.BookBorrowRecord;
import course.linkflower.link.oneframework.members.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BookBorrowRecordMapper {
    List<BookBorrowRecord> listByIds(@Param("ids") Collection<Long> ids);
}
