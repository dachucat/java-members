package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.dto.members.*;
import course.linkflower.link.oneframework.members.service.MemberService;
import course.linkflower.link.oneframework.members.vo.members.MemberInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
    Spring  (全家桶)
    Spring boot (完整底层 / 上层都有的框架)
    Spring web  （web 应用， REST）
    Spring cloud    （Spring boot， ）
    java:
 */
@RestController
@Slf4j
@RequestMapping("/members")
@RefreshScope
public class MembersController {

    @Autowired
    private MemberService memberService;

    //增
    @PostMapping("/add")
    public MemberInfoVo add(@RequestBody MemberDto memberDto) {
        return memberService.add(memberDto);
    }

    //查
    @PostMapping("/update")
    public void update(@RequestBody MemberUpdateDto memberDto) {
        memberService.update(memberDto);
    }
    //查
    @PostMapping("/changePassword")
    public void changePassword(@RequestBody ChangePasswordDto memberDto) {
        memberService.changePassword(memberDto);
    }

    //删
    @PostMapping("/delete")
    public void delete(@RequestBody DeleteDto deleteDto) {
        memberService.delete(deleteDto);
    }

    //查
    @PostMapping("/list")
    public List<MemberInfoVo> list(@RequestBody ListDto listDto) {
        return memberService.list(listDto);
    }
}
