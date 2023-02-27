package course.linkflower.link.oneframework.members.vo.topic;

import lombok.Data;

@Data
public class TopicVo {
    private String name;
    private String parentId;
    private String parent1Id;
    private byte columnType;
    private byte isHot;
    private String icon;
    private String sortValue;
    private String id;
}
