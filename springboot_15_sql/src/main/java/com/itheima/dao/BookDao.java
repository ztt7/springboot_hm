package com.itheima.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);

    // 改成使用 extends BaseMapper<Book>
}
