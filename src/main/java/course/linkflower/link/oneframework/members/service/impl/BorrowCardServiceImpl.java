package course.linkflower.link.oneframework.members.service.impl;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import course.linkflower.link.oneframework.members.dao.BorrowCardMapper;
import course.linkflower.link.oneframework.members.dto.milkPractice.BorrowCardDto;
import course.linkflower.link.oneframework.members.service.BorrowCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowCardServiceImpl implements BorrowCardService {
    @Autowired
    private BorrowCardMapper borrowCardMapper;

    @Override
    public void addBorrowCard(BorrowCardDto borrowCardDto) {
        borrowCardMapper.addBorrowCard(borrowCardDto);
    }

    @Override
    public void deleteBorrowCard(BorrowCardDto borrowCardDto) {
        borrowCardMapper.deleteBorrowCard(borrowCardDto);
    }

    @Override
    public void updateBorrowCard(BorrowCardDto borrowCardDto) {
        borrowCardMapper.updateBorrowCard(borrowCardDto);
    }
}
