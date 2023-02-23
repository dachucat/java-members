package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.BorrowRequestMapper;
import course.linkflower.link.oneframework.members.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.DeleteBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.SearchBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.members.service.BorrowRequestService;
import course.linkflower.link.oneframework.members.vo.borrowRequest.BorrowRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowRequestServiceImpl implements BorrowRequestService {
    @Autowired
    BorrowRequestMapper borrowRequestMapper;

    @Override
    public void addBorrowRequest(AddBorrowRequestDto addBorrowRequestDto) {
        borrowRequestMapper.save(Long.parseLong(addBorrowRequestDto.getBookInfoId()),Long.parseLong(addBorrowRequestDto.getClientId()));
    }

    @Override
    public void updateBorrowRequest(UpdateBorrowRequestDto updateBorrowRequestDto) {
        borrowRequestMapper.update(Long.parseLong(updateBorrowRequestDto.getBookInfoId()));
    }

    @Override
    public void deleteBorrowRequest(DeleteBorrowRequestDto deleteBorrowRequestDto) {
        borrowRequestMapper.delete(Long.parseLong(deleteBorrowRequestDto.getId()));
    }

    @Override
    public BorrowRequestVo getBorrowRequestById(SearchBorrowRequestDto searchBorrowRequestDto) {
        return new BorrowRequestVo().loadFrom(borrowRequestMapper.borrowRequestSearchByid(Long.parseLong(searchBorrowRequestDto.getId())));
    }
}
