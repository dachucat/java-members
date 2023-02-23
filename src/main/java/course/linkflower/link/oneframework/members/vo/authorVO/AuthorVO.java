package course.linkflower.link.oneframework.members.vo.authorVO;

import course.linkflower.link.oneframework.members.model.Author;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AuthorVO {
    private String id;
    private String name;
    private String phone;
    private String country;
    private String address;
    private String mail;
    private String remark;

    public AuthorVO loadFrom(Author author){
        if (author!=null){
            id=String.valueOf(author.getId());
            name= author.getName();
            phone=author.getPhone();
            country=author.getCountry();
            address=author.getAddress();
            mail=author.getMail();
            remark=author.getRemark();
        }
        return this;
    }

    public static List<AuthorVO> loadFromList(List<Author> list){
        List<AuthorVO> ao=new ArrayList<>();
        for (Author l:list){
            ao.add(new AuthorVO().loadFrom(l));
        }
        return ao;
    }
}
