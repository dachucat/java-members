package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.dto.borrowRecord.AddBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.DeleteBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.SearchBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.UpdateBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.DeleteBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.SearchBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.members.service.BorrowRequestService;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;
import course.linkflower.link.oneframework.members.vo.borrowRequest.BorrowRequestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/borrowRequest")
@RefreshScope
public class BorrowRequestController {
    @Autowired
    BorrowRequestService borrowRequestService;
    @PostMapping("/add")
    public void add(@RequestBody AddBorrowRequestDto addBorrowRequestDto) {
        borrowRequestService.addBorrowRequest(addBorrowRequestDto);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody DeleteBorrowRequestDto deleteBorrowRequestDto) {
       borrowRequestService.deleteBorrowRequest(deleteBorrowRequestDto);
    }

    @PostMapping("/update")
    public void update(@RequestBody UpdateBorrowRequestDto updateBorrowRequestDto) {
        borrowRequestService.updateBorrowRequest(updateBorrowRequestDto);
    }

    @PostMapping("/search")
    public BorrowRequestVo search(@RequestBody SearchBorrowRequestDto searchBorrowRequestDto) {
        return borrowRequestService.getBorrowRequestById(searchBorrowRequestDto);
    }
}
