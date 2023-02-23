package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.AuthorMapper;
import course.linkflower.link.oneframework.members.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.members.dto.author.AuthorIdDto;
import course.linkflower.link.oneframework.members.service.AuthorService;
import course.linkflower.link.oneframework.members.vo.authorVO.AuthorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public void addAuthor(AddAuthorDto addAuthorDto) {
        authorMapper.addAuthor(addAuthorDto.getName(), addAuthorDto.getPhone(), addAuthorDto.getCountry(), addAuthorDto.getAddress(), addAuthorDto.getMail(), addAuthorDto.getRemark());
    }

    @Override
    public AuthorVo getAuthorById(AuthorIdDto authorIdDto) {
        return new AuthorVo().loadFrom(authorMapper.getAuthorById(Long.parseLong(authorIdDto.getId())));
    }
}
