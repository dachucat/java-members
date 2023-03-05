package course.linkflower.link.oneframework.members.dto.dictionary;

import course.linkflower.link.oneframework.members.model.Dictionary;
import lombok.Data;

@Data
public class AddDictionaryDto {
    private String type;
    private String key;
    private String value;

    public Dictionary toModel(){
        Dictionary dictionary = new Dictionary();
        dictionary.setType(type);
        dictionary.setKey(key);
        dictionary.setValue(value);
        return dictionary;
    }
}
