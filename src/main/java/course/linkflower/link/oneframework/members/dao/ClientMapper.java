package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.vo.clientwallet.ClientWalletVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClientMapper extends SuperMapper<ClientMapper> {
    List<ClientWalletVo> listWalletByClientId(@Param("id") long id);
}
