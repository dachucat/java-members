package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.model.BookInfo;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInfoVo;

public interface BookInfoService {

    void addBookInfo (AddBookInfoDto addBookInfoDto);
    void updateBookInfo(UpdateBookInfoDto updateBookInfoDto);
    void deleteBookInfo (DeleteBookInfoDto deleteBookInfoDto);
    BookInfoVo getBookInfoById(SearchBookInfoDto searchBookInfoDto);

}
