package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.vo.clientwallet.ClientWalletVo;

import java.util.List;

public interface ClientWalletService {
    List<ClientWalletVo> listWalletByClientId(IdDto idDto);
}
