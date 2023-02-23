package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.dto.bookShelf.AddBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.DeleteBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.SearchBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.UpdateBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.DeleteBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.SearchBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.members.service.BookTypeService;
import course.linkflower.link.oneframework.members.vo.bookShelf.BookShelfVo;
import course.linkflower.link.oneframework.members.vo.bookType.BookTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/bookType")
@RefreshScope
public class BookTypeController {
    @Autowired
    BookTypeService bookTypeService;
    @PostMapping("/add")
    public void add(@RequestBody AddBookTypeDto addBookTypeDto) {
        bookTypeService.addBookType(addBookTypeDto);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody DeleteBookTypeDto deleteBookTypeDto) {
       bookTypeService.deleteType(deleteBookTypeDto);
    }

    @PostMapping("/update")
    public void update(@RequestBody UpdateBookTypeDto updateBookTypeDto) {
        bookTypeService.updateType(updateBookTypeDto);
    }

    @PostMapping("/search")
    public BookTypeVo search(@RequestBody SearchBookTypeDto searchBookTypeDto) {
        return bookTypeService.getBookTypeById(searchBookTypeDto);
    }
}
