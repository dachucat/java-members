package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.ClientWalletMapper;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.model.Client;
import course.linkflower.link.oneframework.members.model.ClientWallet;
import course.linkflower.link.oneframework.members.service.ClientWalletService;
import course.linkflower.link.oneframework.members.vo.clientwallet.ClientWalletVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientWalletServiceImpl implements ClientWalletService {
    @Autowired
    private ClientWalletMapper clientWalletMapper;

    @Override
    public List<ClientWalletVo> listWalletByClientId(IdDto idDto) {
        return clientWalletMapper.listWalletByClientId(Long.parseLong(idDto.getId()));
    }
}
