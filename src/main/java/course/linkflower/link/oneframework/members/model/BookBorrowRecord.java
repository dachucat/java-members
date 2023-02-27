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
        private Date startDate;
        private Date endDate;
        private Date bakckDate;
        private String remark;
}
