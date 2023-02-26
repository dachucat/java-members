package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.bookoftype.BookOfTypeDto;
import course.linkflower.link.oneframework.members.vo.bookoftype.BookOfTypeVo;

public interface BookOfTypeService {
    BookOfTypeVo add(BookOfTypeDto bookOfTypeDto);
}
