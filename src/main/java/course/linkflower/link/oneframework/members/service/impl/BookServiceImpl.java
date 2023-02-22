package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.BookMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.DeleteBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.members.ChangePasswordDto;
import course.linkflower.link.oneframework.members.dto.members.DeleteDto;

import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public void add(AddBookDto addBookDto) {
            bookMapper.save(Long.parseLong(addBookDto.getBookInforId()), addBookDto.getInLibraryDate());
    }

    @Override
    public void update(UpdateBookDto updateBookDto) {
            bookMapper.update(Long.parseLong(updateBookDto.getBookInfoId()));
    }

    @Override
    public void delete(DeleteBookDto deleteBookDto) {
            bookMapper.delete(Long.parseLong(deleteBookDto.getId()));
    }

    @Override
    public Book bookSearch(Book book) {
        bookMapper.bookSearch(book.getId());
        return book;
    }
}
