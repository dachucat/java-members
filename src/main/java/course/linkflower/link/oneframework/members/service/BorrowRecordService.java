package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.DeleteBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.SearchBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.AddBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.DeleteBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.SearchBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.UpdateBorrowRecordDto;
import course.linkflower.link.oneframework.members.vo.bookType.BookTypeVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;

public interface BorrowRecordService {
    void addBorrowRecord (AddBorrowRecordDto addBorrowRecordDto);
    void updateBorrowRecord(UpdateBorrowRecordDto updateBorrowRecordDto);
    void deleteBorrowRecord (DeleteBorrowRecordDto deleteBorrowRecordDto);
    BorrowRecordVo getBorrowRecordById(SearchBorrowRecordDto searchBorrowRecordDto);
}
