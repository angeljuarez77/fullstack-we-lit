package com.example.bookapplication.controller;

import com.example.bookapplication.models.Book;
import com.example.bookapplication.repository.BookRepository;
import com.example.bookapplication.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    BookService bookService;

    @GetMapping
    public Iterable<Book> listBooks() {
        return bookService.listBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
