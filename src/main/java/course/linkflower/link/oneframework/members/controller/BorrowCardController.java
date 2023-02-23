package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.dto.borrowCard.BorrowCardDto;
import course.linkflower.link.oneframework.members.service.BorrowCardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/borrowCard")
@RefreshScope
public class BorrowCardController {
    @Autowired
    private BorrowCardService borrowCardService;
    @PostMapping("/addBorrowCard")
    void addBorrowCard(@RequestBody BorrowCardDto borrowCardDto){
        borrowCardService.addBorrowCard(borrowCardDto);
    }

    @PostMapping("/deleteBorrowCard")
    void deleteBorrowCard(@RequestBody BorrowCardDto borrowCardDto){
        borrowCardService.deleteBorrowCard(borrowCardDto);
    }

    @PostMapping("/updateBorrowCard")
    void updateBorrowCard(@RequestBody BorrowCardDto borrowCardDto){
        borrowCardService.updateBorrowCard(borrowCardDto);
    }
}
