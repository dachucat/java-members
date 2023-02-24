package course.linkflower.link.oneframework.members.dto.author;

import course.linkflower.link.oneframework.members.model.Author;
import lombok.Data;

@Data
public class AuthorIdDto {
    private String id;

    public Author toModel(AuthorIdDto authorIdDto){
        Author author=new Author();
        author.setId(Long.parseLong(id));
        return author;
    }
}
