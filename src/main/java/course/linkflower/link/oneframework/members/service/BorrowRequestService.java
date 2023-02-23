package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.borrowRecord.AddBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.DeleteBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.SearchBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.UpdateBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.DeleteBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.SearchBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;
import course.linkflower.link.oneframework.members.vo.borrowRequest.BorrowRequestVo;

public interface BorrowRequestService {
    void addBorrowRequest (AddBorrowRequestDto addBorrowRequestDto);
    void updateBorrowRequest(UpdateBorrowRequestDto updateBorrowRequestDto);
    void deleteBorrowRequest (DeleteBorrowRequestDto deleteBorrowRequestDto);
    BorrowRequestVo getBorrowRequestById(SearchBorrowRequestDto searchBorrowRequestDto);
}
