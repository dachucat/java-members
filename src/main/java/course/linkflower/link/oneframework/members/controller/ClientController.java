//package course.linkflower.link.oneframework.members.controller;
//
//import course.linkflower.link.oneframework.common.model.Result;
//import course.linkflower.link.oneframework.members.service.ClientService;
//import course.linkflower.link.oneframework.members.vo.client.WalletVo;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Slf4j
//@RequestMapping("/Client")
//@RefreshScope
//public class ClientController {
//    @Autowired
//    private ClientService clientService;
//    @PostMapping("/WalletVo")
//    public Result<AllWallet> listWalletinforById(@RequestBody WalletVo walletVo){
//        return Result.succeed(clientService.listWalletinforById(walletVo));
//    }
//}
