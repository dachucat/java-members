package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.DeleteBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.SearchBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.*;
import course.linkflower.link.oneframework.members.service.BorrowRecordService;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookType.BookTypeVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;
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
@RequestMapping("/borrowRecord")
@RefreshScope
public class BorrowRecordController {
    @Autowired
    BorrowRecordService borrowRecordService;

    @PostMapping("/add")
    public Result add(@RequestBody AddBorrowRecordDto addBorrowRecordDto) {
        borrowRecordService.addBorrowRecord(addBorrowRecordDto);
        return  Result.succeed();
    }

    @PostMapping("/delete")
    public void delete(@RequestBody DeleteBorrowRecordDto deleteBorrowRecordDto) {
        borrowRecordService.deleteBorrowRecord(deleteBorrowRecordDto);
    }

    @PostMapping("/update")
    public void update(@RequestBody UpdateBorrowRecordDto updateBorrowRecordDto) {
        borrowRecordService.updateBorrowRecord(updateBorrowRecordDto);
    }

    @PostMapping("/search")
    public BorrowRecordVo search(@RequestBody SearchBorrowRecordDto searchBorrowRecordDto) {
        return borrowRecordService.getBorrowRecordById(searchBorrowRecordDto);
    }

}
