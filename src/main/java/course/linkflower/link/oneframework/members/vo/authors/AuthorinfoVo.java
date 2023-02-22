//package course.linkflower.link.oneframework.members.vo.authors;
//
//import course.linkflower.link.oneframework.members.dto.author.AuthorDto;
//import course.linkflower.link.oneframework.members.model.Author;
//import course.linkflower.link.oneframework.members.model.Member;
//import course.linkflower.link.oneframework.members.vo.members.MemberInfoVo;
//import lombok.Data;
//
//@Data
//public class AuthorinfoVo {
//    private String name;
//    private String birth;
//    private String id;
//    public AuthorinfoVo loadFrom(Author a) {
//        if (a != null) {
//            name = a.getName();
//            birth = a.getBirth();
//            id=String.valueOf(a.getId());
//        }
//        return this;
//    }
//    public AuthorinfoVo postMessage(String id) {
//        return this;
//    }
//}
