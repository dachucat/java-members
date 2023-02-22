package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.dto.milkPractice.AuthorDto;
import course.linkflower.link.oneframework.members.model.Author;
import course.linkflower.link.oneframework.members.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/author")
@RefreshScope
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public void addAuthor(AuthorDto authorDto){
        authorService.addAuthor(authorDto);
    }
}
