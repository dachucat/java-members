package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.model.Client;
import course.linkflower.link.oneframework.members.model.ClientWallet;
import course.linkflower.link.oneframework.members.service.ClientWalletService;
import course.linkflower.link.oneframework.members.vo.clientwallet.ClientWalletVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
@RequestMapping("/clientWallet")
@RefreshScope
public class ClientWalletCountroller {
    @Autowired
    private ClientWalletService clientWalletService ;
    @PostMapping("/listWalletByClientId")
    public Result<List<ClientWalletVo>> listWalletByClientId(@RequestBody IdDto idDto){
        return Result.succeed(clientWalletService.listWalletByClientId(idDto));
    }
}
