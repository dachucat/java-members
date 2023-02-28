package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.consts.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.dao.*;
import course.linkflower.link.oneframework.members.dto.book.BookShortInfoVo;
import course.linkflower.link.oneframework.members.dto.bookShelf.BookShelfInfoVo;
import course.linkflower.link.oneframework.members.dto.borrowRecord.*;
import course.linkflower.link.oneframework.members.model.*;
import course.linkflower.link.oneframework.members.service.BorrowRecordService;
import course.linkflower.link.oneframework.members.service.TopicService;
import course.linkflower.link.oneframework.members.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.members.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.members.vo.borrowRecord.BorrowRecordVo;
import course.linkflower.link.oneframework.members.vo.client.ClientInfoVo;
import course.linkflower.link.oneframework.members.vo.publisher.PublisherInfoVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.record.BookBoolRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BorrowRecordServiceImpl implements BorrowRecordService {
    @Autowired
    BorrowRecordMapper borrowRecordMapper;

    @Autowired
    BookInfoMapper bookInfoMapper;

    @Autowired
    BookMapper bookMapper;

    @Autowired
    BookShelfMapper bookShelfMapper;

    @Autowired
    PublisherMapper publisherMapper;
    @Autowired
    ClientMapper clientMapper;
    @Autowired
    BookBorrowRecordMapper bookBorrowRecordMapper;

    @Autowired
    private TopicService topicService;

    @Override
    public void addBorrowRecord(AddBorrowRecordDto addBorrowRecordDto) {
        borrowRecordMapper.save(Long.parseLong(addBorrowRecordDto.getClientId()),addBorrowRecordDto.getStartDate());
    }

    @Override
    public void updateBorrowRecord(UpdateBorrowRecordDto updateBorrowRecordDto) {
        borrowRecordMapper.update(Long.parseLong(updateBorrowRecordDto.getClientId()));
    }

    @Override
    public void deleteBorrowRecord(DeleteBorrowRecordDto deleteBorrowRecordDto) {
        topicService.getTopicByIdIn(Long.parseLong(deleteBorrowRecordDto.getId()));
        borrowRecordMapper.delete(Long.parseLong(deleteBorrowRecordDto.getId()));
    }

    @Override
    public BorrowRecordVo getBorrowRecordById(SearchBorrowRecordDto searchBorrowRecordDto) {
        return new BorrowRecordVo().loadFrom(borrowRecordMapper.borrowRecordSearchByid(Long.parseLong(searchBorrowRecordDto.getId())));
    }

}
