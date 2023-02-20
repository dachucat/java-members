package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.members.ListDto;
import course.linkflower.link.oneframework.members.model.Member;
import course.linkflower.link.oneframework.members.vo.book.MemberBorrowInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author xxx
 * 角色菜单
 */
@Mapper
public interface MemberMapper extends SuperMapper<MemberMapper> {

	Member getOneByAccount(@Param("account") String account);

	Member getOneById(@Param("id") String id);

	int saveAccount(@Param("account") String account, @Param("password") String password);

	int save(Member member);

	int delete(@Param("id") Long id);	//删除一条, 0 ----delete(null), 100%

	int update(Member member);

	void changePassword(@Param("id") String id, @Param("password")  String password);

	List<Member> list(ListDto listDto);

	List<MemberBorrowInfo> listMemberBorrowInfo(@Param("member_id") long id);
}
