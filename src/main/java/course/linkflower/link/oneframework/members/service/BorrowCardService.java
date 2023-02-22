package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.milkPractice.BorrowCardDto;

public interface BorrowCardService {
    void addBorrowCard(BorrowCardDto borrowCardDto);
    void deleteBorrowCard(BorrowCardDto borrowCardDto);
    void updateBorrowCard(BorrowCardDto borrowCardDto);
}
