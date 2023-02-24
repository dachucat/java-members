package course.linkflower.link.oneframework.members.dto.borrowRecord;

import lombok.Data;

@Data
public class SearchByDateDto {
    private String startDate;
    private String endDate;
    private int pageNo; //第几页
    private int pageCount;  //每页的数量
}
