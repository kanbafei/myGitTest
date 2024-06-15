package com.example.fenye.service;

import com.example.fenye.dao.bookMapper;
import com.example.fenye.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookServiceImpl implements bookService{
    @Autowired
    bookMapper bookMapper;
    @Override
    public List<Book> getBooks(int n, int m) {
        System.out.println("2");
        return bookMapper.getBooks(n, m);
    }

    @Override
    public Book get(int n) {
        return bookMapper.get(n);
    }
}
