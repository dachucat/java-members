package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.MemberMapper;
import course.linkflower.link.oneframework.members.dto.members.*;
import course.linkflower.link.oneframework.members.model.Member;
import course.linkflower.link.oneframework.members.service.MemberService;
import course.linkflower.link.oneframework.members.vo.members.MemberInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public MemberInfoVo add(MemberDto memberDto) {
        //差唯一判断
        memberMapper.saveAccount(memberDto.getAccount(), memberDto.getPassword());
        return new MemberInfoVo().loadFrom(memberMapper.getOneByAccount(memberDto.getAccount()));
    }

    @Override
    public void update(MemberUpdateDto memberDto) {
        memberMapper.update(memberDto.toMember(memberMapper.getOneById(memberDto.getId())));
    }

    @Override
    public void changePassword(ChangePasswordDto memberDto) {
        memberMapper.changePassword(memberDto.getId(), memberDto.getPassword());
    }

    @Override
    public void delete(DeleteDto deleteDto) {
        memberMapper.delete(Long.parseLong(deleteDto.getId()));
    }

    @Override
    public List<MemberInfoVo> list(ListDto listDto) {
        return MemberInfoVo.loadFromList(memberMapper.list(listDto));
    }
}
