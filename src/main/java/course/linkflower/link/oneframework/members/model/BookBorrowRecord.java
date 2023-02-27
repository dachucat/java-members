package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("book_borrow_record")
public class BookBorrowRecord {
        private long id;
        private long clientId;
        private long borrowCardId;
        private long borrowId;
        private long bookId;
        private long bookInforId;
        private int status;
        private String startDate;
        private String endDate;
        private String bakckDate;
        private String remark;
}
