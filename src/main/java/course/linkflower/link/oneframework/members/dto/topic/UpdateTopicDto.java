package course.linkflower.link.oneframework.members.dto.topic;

import course.linkflower.link.oneframework.members.model.Topic;
import lombok.Data;

@Data
public class UpdateTopicDto {
    private String id;
    private String name;
    private String parentId;
    private String parent1Id;
    private int columnType;
    private int isHot;
    private int sortValue;
    private String icon;
    public Topic toModel(){
        Topic topic = new Topic();
        topic.setId(Long.parseLong(id));
        topic.setName(name);
        if(parentId!=null){
            topic.setParentId(Long.valueOf(parentId));
        }
        if (parent1Id!=null){
            topic.setParent1Id(Long.valueOf(parent1Id));
        }
        topic.setColumnType(columnType);
        topic.setIsHot(isHot);
        topic.setSortValue(sortValue);
        topic.setIcon(icon);
        return topic;
    }
}
