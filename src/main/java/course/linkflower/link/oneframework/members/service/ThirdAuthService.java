package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.members.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.members.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.members.dto.thirdAuth.AddThirdAuthDto;
import course.linkflower.link.oneframework.members.dto.thirdAuth.DeleteThirdAuthDto;
import course.linkflower.link.oneframework.members.dto.thirdAuth.SearchThirdAuthDto;
import course.linkflower.link.oneframework.members.dto.thirdAuth.UpdateThirdAuthDto;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherVo;

public interface ThirdAuthService {
    void addThirdAuth (AddThirdAuthDto addThirdAuthDto);
    void updateThirdAuth(UpdateThirdAuthDto updateThirdAuthDto);
    void deleteThirdAuth (DeleteThirdAuthDto deleteThirdAuthDto);
    PublisherVo getThirdAuthById(SearchThirdAuthDto searchThirdAuthDto);
}
