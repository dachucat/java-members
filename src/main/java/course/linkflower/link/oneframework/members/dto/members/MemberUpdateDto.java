package course.linkflower.link.oneframework.members.dto.members;

import course.linkflower.link.oneframework.members.model.Member;
import lombok.Data;

@Data
public class MemberUpdateDto {
    private String id;
    private String name;
    private String mail;

    public Member toMember(Member m) {
        if (m == null) {
            m = new Member();
        }
        m.setId(Long.parseLong(id));
        m.setName(name);
        m.setMail(mail);
        return m;
    }
}
