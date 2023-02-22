//package course.linkflower.link.oneframework.members.service.impl;
//
//
//import course.linkflower.link.oneframework.members.dto.author.AuthorDto;
//import course.linkflower.link.oneframework.members.dto.author.DeleteAuthorDto;
//import course.linkflower.link.oneframework.members.dto.author.SearchAuthorDto;
//import course.linkflower.link.oneframework.members.model.Author;
//import course.linkflower.link.oneframework.members.service.AuthorService;
//import course.linkflower.link.oneframework.members.service.MemberService;
//import course.linkflower.link.oneframework.members.vo.authors.AuthorinfoVo;
//import course.linkflower.link.oneframework.members.vo.members.MemberInfoVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AuthorServiceImpl implements AuthorService {
//    @Autowired
//    private AuthorMapper authorMapper;
//    @Override
//    public AuthorinfoVo add(AuthorDto authorDto){
//        authorMapper.saveAuthor(authorDto.getName(), Long.parseLong(authorDto.getBirth()));
//        return new AuthorinfoVo().loadFrom(authorMapper.getAuthorName(authorDto.getName()));
//    }
//    @Override
//    public AuthorinfoVo search(SearchAuthorDto searchAuthorDto){
//        authorMapper.getAuthorId(Long.parseLong(searchAuthorDto.getId()));
//        return new AuthorinfoVo().loadFrom(authorMapper.getAuthorId(Long.parseLong(searchAuthorDto.getId())));
//    }
//    @Override
//    public AuthorinfoVo delete(DeleteAuthorDto deleteAuthorDto){
//        authorMapper.deleteAuthor(Long.parseLong(deleteAuthorDto.getId()));
//        return new AuthorinfoVo().loadFrom(authorMapper.getAuthorId(Long.parseLong(deleteAuthorDto.getId())));
//    }
//}
