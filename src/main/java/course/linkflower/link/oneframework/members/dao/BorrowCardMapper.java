package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.borrowCard.BorrowCardDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BorrowCardMapper extends SuperMapper<BorrowCardMapper> {
    int addBorrowCard(BorrowCardDto borrowCardDto);
    int deleteBorrowCard(BorrowCardDto borrowCardDto);

    int updateBorrowCard(BorrowCardDto borrowCardDto);
}
