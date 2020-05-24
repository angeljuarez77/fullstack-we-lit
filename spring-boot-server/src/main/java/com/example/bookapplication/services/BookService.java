package com.example.bookapplication.services;

import com.example.bookapplication.models.Book;

public interface BookService {
    public Book createBook(Book book);

    public Iterable<Book> listBooks();
}
