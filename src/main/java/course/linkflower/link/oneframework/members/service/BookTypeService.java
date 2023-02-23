package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.members.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.DeleteBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.SearchBookTypeDto;
import course.linkflower.link.oneframework.members.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.members.model.BookType;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInfoVo;
import course.linkflower.link.oneframework.members.vo.bookType.BookTypeVo;

public interface BookTypeService {
    void addBookType (AddBookTypeDto addBookTypeDto);
    void updateType(UpdateBookTypeDto updateBookTypeDto);
    void deleteType (DeleteBookTypeDto deleteBookTypeDto);
    BookTypeVo getBookTypeById(SearchBookTypeDto searchBookTypeDto);
}
