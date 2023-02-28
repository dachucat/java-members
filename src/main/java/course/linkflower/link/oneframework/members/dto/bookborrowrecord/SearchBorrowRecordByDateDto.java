package course.linkflower.link.oneframework.members.dto.bookborrowrecord;

import lombok.Data;

@Data
public class SearchBorrowRecordByDateDto {
    private String startDate;
    private String endDate;
    private int pageNo; //第几页
    private int pageCount;  //每页的数量
}
