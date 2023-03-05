package course.linkflower.link.oneframework.members.vo.dictionary;

import course.linkflower.link.oneframework.members.model.Dictionary;
import lombok.Data;

@Data
public class DictionaryVo {
    private String id;
    private String type;
    private String key;
    private String value;

    public DictionaryVo loadFrom(Dictionary d){
        if (d!=null){
            id =String.valueOf(d.getId());
            type = d.getType();
            key = d.getKey();
            value = d.getValue();
        }
        return this;
    }
}
