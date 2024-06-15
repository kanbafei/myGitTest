package com.example.fenye.controller;

import com.example.fenye.pojo.Book;
import com.example.fenye.service.bookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String get(){
        return "hello world";
    }
    @GetMapping("/ww")
    public Book ss(int n){
        Book book=bookService.get(n);
        System.out.println(book);
        return book;
    }
}
