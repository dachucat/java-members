package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.members.model.BorrowRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BorrowRequestMapper extends SuperMapper<BorrowRequest> {
    int save(@Param("clientId") long clientId , @Param("bookInfoId") long bookInfoId);

    int delete(@Param("id") Long id);

    int update(@Param("bookInfoId") long bookInfoId);

    BorrowRequest borrowRequestSearchByid (@Param("id") Long id);
}
