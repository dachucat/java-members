package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.DeleteBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.SearchBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.members.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.members.vo.borrowRequest.BorrowRequestVo;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;

public interface PublisherService {
    void addPublisher (AddPublisherDto addPublisherDto);
    void updatePublisher(UpdatePublisherDto updatePublisherDto);
    void deletePublisher (DeletePublisherDto deletePublisherDto);
    PublisherVo getPublisherById(SearchPublisherDto searchPublisherDto);
}
