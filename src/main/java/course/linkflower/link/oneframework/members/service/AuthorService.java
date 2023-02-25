package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.members.dto.author.AuthorIdDto;
import course.linkflower.link.oneframework.members.dto.author.UpdateAuthorDto;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.vo.author.AuthorVo;

public interface AuthorService {
    AuthorVo addAuthor(AddAuthorDto addAuthorDto);
    AuthorVo getAuthorById(IdDto idDto);

    AuthorVo updateAuthor(UpdateAuthorDto updateAuthorDto);

    void deleteAuthorById(IdDto idDto);
}
