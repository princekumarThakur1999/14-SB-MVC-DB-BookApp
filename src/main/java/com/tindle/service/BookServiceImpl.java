package com.tindle.service;

import com.tindle.entiity.Book;
import com.tindle.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBooks() {

        List<Book> Books = bookRepository.findAll();

        return Books;
    }
}
