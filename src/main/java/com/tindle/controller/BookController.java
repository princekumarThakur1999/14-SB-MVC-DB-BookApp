package com.tindle.controller;

import com.tindle.entiity.Book;
import com.tindle.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/allbooks")
    public ModelAndView getAllBooks() {
        ModelAndView modelAndView = new ModelAndView();

        List<Book> books = bookService.getBooks();
        modelAndView.addObject("books",books);
        modelAndView.setViewName("books");

        return modelAndView;
    }
}
