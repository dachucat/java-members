package course.linkflower.link.oneframework.members.vo.members;

import course.linkflower.link.oneframework.members.model.Member;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/*
 *  admin side: 管理后台
 */
@Data
public class MemberInfoVo {
    private String id;
    private String name;
    private String account;
    private String mail;
    private String password;
    private int status; // 0, 1, 2

    public MemberInfoVo loadFrom(Member m) {
        if (m == null) {
            id = String.valueOf(m.getId());
            name = m.getName();
            account = m.getAccount();
            mail = m.getMail();
            password = m.getPassword();
            status = m.getStatus();
        }
        return this;
    }

    public static List<MemberInfoVo> loadFromList(List<Member> memberList) {
        List<MemberInfoVo> list = new ArrayList<>();
        if (memberList != null) {
            for (Member m : memberList) {
                list.add(new MemberInfoVo().loadFrom(m));
            }
        }
        return list;
    }
}
