package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Insert;

public interface IBookService extends IService<Book> {
    //添加非通用操作API接口




    boolean saveBook(Book book);
    boolean modify(Book book);
    boolean delete(Integer id);


    IPage<Book> getPage(int currentPage,int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);

}
