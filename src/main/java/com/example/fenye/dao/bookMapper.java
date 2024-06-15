package com.example.fenye.dao;

import com.example.fenye.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface bookMapper {
    @Select("select * from books limit #{n},#{m}")
    List<Book> getBooks(@Param("n") int n, @Param("m") int m);
    @Select("select * from books where bookID=#{n}")
    Book get(int n);
}
