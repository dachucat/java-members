package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.members.dto.author.AuthorIdDto;
import course.linkflower.link.oneframework.members.vo.authorVO.AuthorVo;

public interface AuthorService {
    void addAuthor(AddAuthorDto addAuthorDto);
    AuthorVo getAuthorById(AuthorIdDto authorIdDto);
}
