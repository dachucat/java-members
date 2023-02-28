package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.BookBorrowRecordMapper;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.AddBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.DeleteBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.SearchBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.bookborrowrecord.UpdateBookBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.SearchByDateDto;
import course.linkflower.link.oneframework.members.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.members.service.BookBorrowRecordService;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookborrowrecordvo.BookBorrowRecordVo;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/bookborrowrecord")
@RefreshScope
public class BookBorrowRecordController {
    @Autowired
    BookBorrowRecordService bookBorrowRecordService;
    @PostMapping("/add")
    public Result add(@RequestBody AddBookBorrowRecordDto addBookBorrowRecordDto) {
        bookBorrowRecordService.addBookBorrowRecord(addBookBorrowRecordDto);
        return Result.succeed();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteBookBorrowRecordDto deleteBookBorrowRecordDto) {
        bookBorrowRecordService.deleteBookBorrowRecord(deleteBookBorrowRecordDto);
        return Result.succeed();
    }

    @PostMapping("/update")
    public Result update(@RequestBody UpdateBookBorrowRecordDto updateBookBorrowRecordDto) {
       bookBorrowRecordService.updateBookBorrowRecord(updateBookBorrowRecordDto);
        return Result.succeed();
    }

    @PostMapping("/search")
    public BookBorrowRecordVo search(@RequestBody SearchBookBorrowRecordDto searchBookBorrowRecordDto) {
        return bookBorrowRecordService.getBookBorrowRecordById(searchBookBorrowRecordDto);
    }
    @PostMapping("/listBookByDate")
    public Result<PageModelResult<List<BookDetailVo>>> listBookByDate(@RequestBody SearchByDateDto dto) {
        return bookBorrowRecordService.listBookByDate(dto);
    }
}
