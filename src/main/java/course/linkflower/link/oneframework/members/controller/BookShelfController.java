package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.AddBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.DeleteBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.SearchBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.UpdateBookShelfDto;
import course.linkflower.link.oneframework.members.service.BookshelfService;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInfoVo;
import course.linkflower.link.oneframework.members.vo.bookShelf.BookShelfVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/bookshelf")
@RefreshScope
public class BookShelfController {
    @Autowired
    BookshelfService bookshelfService;

    @PostMapping("/add")
    public void add(@RequestBody AddBookShelfDto addBookShelfDto) {
        bookshelfService.addBookShelf(addBookShelfDto);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody DeleteBookShelfDto deleteBookShelfDto) {
        bookshelfService.deleteBookShelf(deleteBookShelfDto);
    }

    @PostMapping("/update")
    public void update(@RequestBody UpdateBookShelfDto updateBookShelfDto) {
        bookshelfService.updateBookShelf(updateBookShelfDto);
    }

    @PostMapping("/search")
    public BookShelfVo search(@RequestBody SearchBookShelfDto searchBookShelfDto) {
        return bookshelfService.getBookShelfById(searchBookShelfDto);
    }
}
