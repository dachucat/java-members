package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.DeleteBookDto;
import course.linkflower.link.oneframework.members.dto.book.SearchBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.members.ChangePasswordDto;
import course.linkflower.link.oneframework.members.dto.members.DeleteDto;

import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.vo.book.BookVo;

import java.util.List;


public interface BookService {
    void add(AddBookDto addBookDto);
    void update(UpdateBookDto updateBookDto);
    void delete(DeleteBookDto deleteBookDto);
    List<BookVo> bookSearch(SearchBookDto book);
    BookVo getBookById(long id);

    List<BookVo> listBookByBookId(long id);
}
