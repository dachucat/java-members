package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.AuthorMapper;
import course.linkflower.link.oneframework.members.dto.milkPractice.AuthorDto;
import course.linkflower.link.oneframework.members.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public void addAuthor(AuthorDto authorDto) {
        authorMapper.addAuthor(authorDto);
    }
}
