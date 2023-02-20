package course.linkflower.link.oneframework.members.dto.book;

import lombok.Data;

@Data
public class PutawayBookDto {
    private String barcode;
    private String bookInforId;
//    缺少是否增加book_infor中新书目判断，缺少增加原有书籍数目判断
}
