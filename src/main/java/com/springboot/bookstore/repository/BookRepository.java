package com.springboot.bookstore.repository;

import com.springboot.bookstore.model.book.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Integer> {
}
