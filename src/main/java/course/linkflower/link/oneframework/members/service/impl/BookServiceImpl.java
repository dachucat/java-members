package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.lang.Lang;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.consts.MemberErrorContst;
import course.linkflower.link.oneframework.members.dao.BookInfoMapper;
import course.linkflower.link.oneframework.members.dao.BookMapper;
import course.linkflower.link.oneframework.members.dao.BookShelfMapper;
import course.linkflower.link.oneframework.members.dto.book.*;
import course.linkflower.link.oneframework.members.dto.members.ChangePasswordDto;
import course.linkflower.link.oneframework.members.dto.members.DeleteDto;

import course.linkflower.link.oneframework.members.model.Book;
import course.linkflower.link.oneframework.members.model.BookInfo;
import course.linkflower.link.oneframework.members.model.Bookshelf;
import course.linkflower.link.oneframework.members.service.BookService;
import course.linkflower.link.oneframework.members.vo.book.BookVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Autowired
    private BookShelfMapper bookShelfMapper;

    @Override
    public int deleteByBookInforId(long id) {
        return bookMapper.deleteByBookInforId(id);
    }

    @Override
    public BookVo add(AddBookDto addBookDto) {
        Book b = addBookDto.toModel();
        bookMapper.save(b);
        return bookInfoMapper.getDetailById(b.getId());
    }

    @Override
    public void update(UpdateBookDto updateBookDto) {
            bookMapper.update(Long.parseLong(updateBookDto.getBookInfoId()));
    }

    @Override
    public void delete(DeleteBookDto deleteBookDto) {
            bookMapper.delete(Long.parseLong(deleteBookDto.getId()));
    }

    @Override
    public List<BookVo> bookSearch(SearchBookDto book) {
        return bookMapper.bookSearch(book);
    }

    @Override
    public BookVo getBookById(long id) {
        return bookMapper.bookSearchById(id);
    }

    @Override
    public List<BookVo> listBookByBookId(long id) {
        return bookMapper.listBookByBookId(id);
    }

    @Override
    public Result<BookVo> addBookByBarcodeToLibrary(AddBookByBarcodeDto addBookByBarcodeDto) {
        BookInfo bi = bookInfoMapper.getBookByBarcode(addBookByBarcodeDto.getBookInforBarcode());
        if (bi != null) {
            Book b = new Book();
            b.setBookInforId(bi.getId());
            b.setBarcode(addBookByBarcodeDto.getBookBarcode());
            if (!StringUtils.isEmpty(addBookByBarcodeDto.getBookshelfBarcode())) {
                Bookshelf bs = bookShelfMapper.getByBarcode(addBookByBarcodeDto.getBookshelfBarcode());
                if (bs == null) {
                    return Result.of(null, MemberErrorContst.ErrorCodeMemberBaseBookshelfNotExist, Lang.T(MemberErrorContst.ErrorMsgMemberBaseBookshelfNotExist));
                }
                b.setBookShelfId(bs.getId());
            }
            bookMapper.save(b);
            return Result.succeed(bookInfoMapper.getDetailById(b.getId()));
        }
        return Result.of(null, MemberErrorContst.ErrorCodeMemberBaseBookInforNotExist, Lang.T(MemberErrorContst.ErrorMsgMemberBaseBookshelfNotExist));
    }
}
