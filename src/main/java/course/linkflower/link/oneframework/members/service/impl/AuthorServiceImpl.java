package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.AuthorMapper;
import course.linkflower.link.oneframework.members.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.members.dto.author.AuthorIdDto;
import course.linkflower.link.oneframework.members.dto.author.UpdateAuthorDto;
import course.linkflower.link.oneframework.members.dto.base.IdDto;
import course.linkflower.link.oneframework.members.model.Author;
import course.linkflower.link.oneframework.members.service.AuthorService;
import course.linkflower.link.oneframework.members.vo.author.AuthorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public AuthorVo addAuthor(AddAuthorDto addAuthorDto) {
         authorMapper.addAuthor(addAuthorDto);
         return authorMapper.getAuthorById(Long.parseLong(addAuthorDto.getId()));
    }

    @Override
    public AuthorVo getAuthorById(IdDto idDto) {
        return authorMapper.getAuthorById(Long.parseLong(idDto.getId()));
    }

    @Override
    public AuthorVo updateAuthor(UpdateAuthorDto updateAuthorDto) {
        Author author=updateAuthorDto.toModel(updateAuthorDto);
        authorMapper.updateAuthor(author);
        return authorMapper.getAuthorById(author.getId());
    }

    @Override
    public void deleteAuthorById(IdDto idDto) {
        authorMapper.deleteAuthorById(Long.parseLong(idDto.getId()));
    }
}
