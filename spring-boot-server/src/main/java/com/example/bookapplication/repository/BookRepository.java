package com.example.bookapplication.repository;

import com.example.bookapplication.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
