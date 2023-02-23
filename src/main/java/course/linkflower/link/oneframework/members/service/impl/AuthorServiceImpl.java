package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.AuthorMapper;
import course.linkflower.link.oneframework.members.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.members.service.AuthorService;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public void addAuthor(AddAuthorDto addAuthorDto) {
        authorMapper.addAuthor(addAuthorDto.getName(),addAuthorDto.getPhone(),addAuthorDto.getCountry(),addAuthorDto.getAddress(),addAuthorDto.getMail(),addAuthorDto.getRemark());

    }
}
