package course.linkflower.link.oneframework.members.vo.client;

import course.linkflower.link.oneframework.members.model.Client;
import lombok.Data;

@Data
public class ClientVo {
    private String id;
    private String name;
    private String mail;
    private String account;
    private String  password;
    private String mobile;
    private byte status;
    private String address;
}
