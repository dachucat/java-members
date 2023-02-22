package course.linkflower.link.oneframework.members.dto.book;
import lombok.Data;

@Data
public class SearchBookDto {
    private String id;
    private String name;
    private boolean isDetail;
    private String searchKey;
}
