package com.example.fenye.controller;

import com.example.fenye.pojo.Book;
import com.example.fenye.service.bookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class bookController {
    @Autowired
    bookService bookService;
    @GetMapping("/book")
    public List<Book> getbooks(@RequestParam("n") int n, @RequestParam("m") int m){
        System.out.println("1");
        List<Book> s= bookService.getBooks(n,m);
        return s;
    }
    @GetMapping("/ss")
    @Transactional(rollbackFor = {Exception.class})
    public String get(){
        bookService.add();
        int n=10/0;//测试声明式事务
        return "OK";
    }
    @GetMapping("/ww")
    public Book ss(int n){
        Book book=bookService.get(n);
        System.out.println(book);
        return book;
    }
}
