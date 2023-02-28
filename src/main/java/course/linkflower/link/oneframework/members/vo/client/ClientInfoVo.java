package course.linkflower.link.oneframework.members.vo.client;

import course.linkflower.link.oneframework.members.model.Client;
import lombok.Data;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

@Data
public class ClientInfoVo {
    private String id;
    private String name;
    public ClientInfoVo loadFrom(Client client){
        if (client != null){
            id = String.valueOf(client.getId());
            name=client.getName();
        }
            return  this;
    }

}
