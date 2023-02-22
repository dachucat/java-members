package course.linkflower.link.oneframework.members.controller;

import course.linkflower.link.oneframework.members.dto.book.*;

import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.service.BookService;

import course.linkflower.link.oneframework.members.vo.book.BookVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/book")
@RefreshScope
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/add")
    public void add(@RequestBody AddBookDto addBookDto) {
        bookService.add(addBookDto);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody DeleteBookDto deleteBookDto) {
        bookService.delete(deleteBookDto);
    }
    @PostMapping("/update")
    public void update(@RequestBody UpdateBookDto updateBookDto) {
        bookService.update(updateBookDto);
    }
    @PostMapping("/search")
    public List<BookVo> search(@RequestBody SearchBookDto book){
        return bookService.bookSearch(book);
    }

    @PostMapping("/getBookById")
    public BookVo getBookById(@RequestBody BookIdDto dto) {
        return bookService.getBookById(dto.getId());
    }

}
