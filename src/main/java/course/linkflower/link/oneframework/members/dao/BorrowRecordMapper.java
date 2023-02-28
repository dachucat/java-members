package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.AddBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.UpdateBorrowRecordDto;
import course.linkflower.link.oneframework.members.model.BorrowRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface BorrowRecordMapper extends SuperMapper<BorrowRecord> {
    int save(@Param("clientId") long clientId , @Param("startDate") String startDate );

    int delete(@Param("id") Long id);

    int update(@Param("clientId") long clientId);

    BorrowRecord borrowRecordSearchByid (@Param("id") Long id);


}
