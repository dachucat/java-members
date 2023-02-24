package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.BookInfoMapper;
import course.linkflower.link.oneframework.members.dao.BookMapper;
import course.linkflower.link.oneframework.members.dto.book.AddBookDto;
import course.linkflower.link.oneframework.members.dto.book.DeleteBookDto;
import course.linkflower.link.oneframework.members.dto.book.SearchBookDto;
import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.members.ChangePasswordDto;
import course.linkflower.link.oneframework.members.dto.members.DeleteDto;

import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.service.BookService;
import course.linkflower.link.oneframework.members.vo.book.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public int deleteByBookInforId(long id) {
        return bookMapper.deleteByBookInforId(id);
    }

    @Override
    public BookVo add(AddBookDto addBookDto) {
        Book b = addBookDto.toModel();
        bookMapper.save(b);
        return bookInfoMapper.getDetailById(b.getId());
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
    public List<BookVo> bookSearch(SearchBookDto book) {
        return bookMapper.bookSearch(book);
    }

    @Override
    public BookVo getBookById(long id) {
        return bookMapper.bookSearchById(id);
    }

    @Override
    public List<BookVo> listBookByBookId(long id) {
        return bookMapper.listBookByBookId(id);
    }
}
