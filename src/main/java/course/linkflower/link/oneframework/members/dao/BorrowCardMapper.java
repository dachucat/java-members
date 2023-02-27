package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.borrowCard.BorrowCardDto;
import course.linkflower.link.oneframework.members.model.BorrowCard;
import course.linkflower.link.oneframework.members.vo.borrowcard.BorrowCardVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.Collection;
import java.util.List;

@Mapper
public interface BorrowCardMapper extends SuperMapper<BorrowCardMapper> {
    int addBorrowCard(BorrowCardDto borrowCardDto);
    int deleteBorrowCard(BorrowCardDto borrowCardDto);
    int updateBorrowCard(BorrowCardDto borrowCardDto);
    BorrowCard getBorrowCardByBorrowCardId(@Param("id") long id);
    List<BorrowCard> listByIds(@Param("ids") Collection<Long> ids);
}
