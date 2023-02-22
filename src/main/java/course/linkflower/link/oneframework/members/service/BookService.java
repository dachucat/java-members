package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.DeleteBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.members.ChangePasswordDto;
import course.linkflower.link.oneframework.members.dto.members.DeleteDto;

import course.linkflower.link.oneframework.members.model.Book;


public interface BookService {
    void add(AddBookDto addBookDto);
    void update(UpdateBookDto updateBookDto);
    void delete(DeleteBookDto deleteBookDto);
    Book bookSearch(Book book);
}
