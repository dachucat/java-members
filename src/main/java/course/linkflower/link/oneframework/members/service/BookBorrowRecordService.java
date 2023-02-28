package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.AddBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.DeleteBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.SearchBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.UpdateBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.*;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookborrowrecordvo.BookBorrowRecordVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;

import java.util.List;

public interface BookBorrowRecordService {
    void addBookBorrowRecord (AddBookBorrowRecordDto addBookBorrowRecordDto);
    void updateBookBorrowRecord(UpdateBookBorrowRecordDto updateBookBorrowRecordDto);
    void deleteBookBorrowRecord (DeleteBookBorrowRecordDto deleteBookBorrowRecordDto);
    BookBorrowRecordVo getBookBorrowRecordById(SearchBookBorrowRecordDto searchBookBorrowRecordDto);

    Result<PageModelResult<List<BookDetailVo>>> listBookByDate(SearchByDateDto searchByDateDto);
}
