package course.linkflower.link.oneframework.members.dto.Client;

import course.linkflower.link.oneframework.members.model.Client;
import lombok.Data;

@Data
public class ClientIdDto {
    private String id;
    public Client toModel(ClientIdDto clientIdDto){
        Client client=new Client();
        client.setId(Long.parseLong(clientIdDto.getId()));
        return client;
    }
}
