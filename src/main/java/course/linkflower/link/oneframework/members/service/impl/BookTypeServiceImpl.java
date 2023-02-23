package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.BookTypeMapper;
import course.linkflower.link.oneframework.members.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.DeleteBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.SearchBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.service.BookTypeService;
import course.linkflower.link.oneframework.members.vo.bookType.BookTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    BookTypeMapper bookTypeMapper;

    @Override
    public void addBookType(AddBookTypeDto addBookTypeDto) {
        bookTypeMapper.save(addBookTypeDto.getName());
    }

    @Override
    public void updateType(UpdateBookTypeDto updateBookTypeDto) {
        bookTypeMapper.update(updateBookTypeDto.getName());
    }

    @Override
    public void deleteType(DeleteBookTypeDto deleteBookTypeDto) {
        bookTypeMapper.delete(Long.parseLong(deleteBookTypeDto.getId()));
    }

    @Override
    public BookTypeVo getBookTypeById(SearchBookTypeDto searchBookTypeDto) {
        return new BookTypeVo().loadFrom(bookTypeMapper.bookTypeSearchById(Long.parseLong(searchBookTypeDto.getId())));
    }
}
