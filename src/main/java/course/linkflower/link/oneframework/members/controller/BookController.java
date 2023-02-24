package course.linkflower.link.oneframework.members.controller;


import course.linkflower.link.oneframework.common.model.Result;
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
    public Result<BookVo> add(@RequestBody AddBookDto addBookDto) {
        return Result.succeed(bookService.add(addBookDto));
    }
    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteBookDto deleteBookDto) {
        bookService.delete(deleteBookDto);
        return Result.succeed();
    }
    @PostMapping("/update")
    public Result update(@RequestBody UpdateBookDto updateBookDto) {
        bookService.update(updateBookDto);
        return Result.succeed();
    }

    /* Todo:
    *   search报错，因为mapper配置根据名字查找信息，但是searchbookdto没有name属性
    * */
    @PostMapping("/search")
    public Result<List<BookVo>> search(@RequestBody SearchBookDto book){
        return Result.succeed(bookService.bookSearch(book));
    }

    @PostMapping("/getBookById")
    public Result<BookVo> getBookById(@RequestBody BookIdDto dto) {
        return Result.succeed(bookService.getBookById(dto.getId()));
    }

    @PostMapping("/listBookByBookId")
    public Result<List<BookVo>> listBookByBookId(@RequestBody BookIdDto dto) {
        return Result.succeed(bookService.listBookByBookId(dto.getId()));
    }

    @PostMapping("/addBookByBarcodeToLibrary")
    public Result<BookVo> addBookByBarcodeToLibrary(@RequestBody AddBookByBarcodeDto dto) {
        return bookService.addBookByBarcodeToLibrary(dto);
    }

}
