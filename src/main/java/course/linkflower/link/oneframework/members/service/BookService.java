package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dto.book.*;
import course.linkflower.link.oneframework.members.dto.members.ChangePasswordDto;
import course.linkflower.link.oneframework.members.dto.members.DeleteDto;

import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.vo.book.BookVo;

import java.util.List;


public interface BookService {

    int deleteByBookInforId(long id);
    BookVo add(AddBookDto addBookDto);
    void update(UpdateBookDto updateBookDto);
    void delete(DeleteBookDto deleteBookDto);
    List<BookVo> bookSearch(SearchBookDto book);
    BookVo getBookById(long id);
    List<BookVo> listBookByBookId(long id);

    Result<BookVo> addBookByBarcodeToLibrary(AddBookByBarcodeDto addBookByBarcodeDto);
}
