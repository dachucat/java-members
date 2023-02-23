package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.AddBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.DeleteBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.SearchBookShelfDto;
import course.linkflower.link.oneframework.members.dto.bookShelf.UpdateBookShelfDto;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInfoVo;
import course.linkflower.link.oneframework.members.vo.bookShelf.BookShelfVo;

public interface BookshelfService {
    void addBookShelf (AddBookShelfDto addBookShelfDto);
    void updateBookShelf(UpdateBookShelfDto updateBookShelfDto);
    void deleteBookShelf (DeleteBookShelfDto deleteBookShelfDto);
    BookShelfVo getBookShelfById(SearchBookShelfDto searchBookShelfDto);
}

