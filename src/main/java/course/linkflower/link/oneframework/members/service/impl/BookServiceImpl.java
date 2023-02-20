package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.BookMapper;
import course.linkflower.link.oneframework.members.dto.book.PutawayBookDto;
import course.linkflower.link.oneframework.members.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void putawayBook(PutawayBookDto putawayBookDto) {
//        是否需要二维码唯一判断？
//        无法解决bookshelf_id输入问题
        bookMapper.addBook(putawayBookDto);
    }
}
