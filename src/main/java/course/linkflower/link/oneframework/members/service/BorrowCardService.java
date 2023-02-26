package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.dto.borrowCard.BorrowCardDto;
import course.linkflower.link.oneframework.members.vo.borrowcard.BorrowCardVo;

public interface BorrowCardService {
    int addBorrowCard(BorrowCardDto borrowCardDto);
    void deleteBorrowCard(BorrowCardDto borrowCardDto);
    void updateBorrowCard(BorrowCardDto borrowCardDto);
    BorrowCardVo getBorrowCardByBorrowCardId(IdDto idDto);
}
