package com.example.fenye.service;

import com.example.fenye.pojo.Book;

import java.util.List;

public interface bookService {
    List<Book> getBooks(int n, int m);
    Book get(int n);

    void add();
}
