package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.BorrowRecordMapper;
import course.linkflower.link.oneframework.members.dto.borrowRecord.AddBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.DeleteBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.SearchBorrowRecordDto;
import course.linkflower.link.oneframework.members.dto.borrowRecord.UpdateBorrowRecordDto;
import course.linkflower.link.oneframework.members.service.BorrowRecordService;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowRecordServiceImpl implements BorrowRecordService {
    @Autowired
    BorrowRecordMapper borrowRecordMapper;

    @Override
    public void addBorrowRecord(AddBorrowRecordDto addBorrowRecordDto) {
        borrowRecordMapper.save(Long.parseLong(addBorrowRecordDto.getClientId()),addBorrowRecordDto.getStartDate());
    }

    @Override
    public void updateBorrowRecord(UpdateBorrowRecordDto updateBorrowRecordDto) {
        borrowRecordMapper.update(Long.parseLong(updateBorrowRecordDto.getClientId()));
    }

    @Override
    public void deleteBorrowRecord(DeleteBorrowRecordDto deleteBorrowRecordDto) {
        borrowRecordMapper.delete(Long.parseLong(deleteBorrowRecordDto.getId()));
    }

    @Override
    public BorrowRecordVo getBorrowRecordById(SearchBorrowRecordDto searchBorrowRecordDto) {
        return new BorrowRecordVo().loadFrom(borrowRecordMapper.borrowRecordSearchByid(Long.parseLong(searchBorrowRecordDto.getId())));
    }
}
