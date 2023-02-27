package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.DeleteBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.SearchBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.*;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookType.BookTypeVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;

import java.util.List;

public interface BorrowRecordService {
    void addBorrowRecord (AddBorrowRecordDto addBorrowRecordDto);
    void updateBorrowRecord(UpdateBorrowRecordDto updateBorrowRecordDto);
    void deleteBorrowRecord (DeleteBorrowRecordDto deleteBorrowRecordDto);
    BorrowRecordVo getBorrowRecordById(SearchBorrowRecordDto searchBorrowRecordDto);

}
