//package course.linkflower.link.oneframework.members.controller;
//
//import course.linkflower.link.oneframework.members.dto.book.PutawayBookDto;
//import course.linkflower.link.oneframework.members.service.BookService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Slf4j
//@RequestMapping("/book")
//@RefreshScope
//public class BookController {
//    @Autowired
//    private BookService bookService;
//
//    @PostMapping("/putawayBook")
//    public void putawayBook(@RequestBody PutawayBookDto putawayBookDto){
//        bookService.putawayBook(putawayBookDto);
//    }
//}
