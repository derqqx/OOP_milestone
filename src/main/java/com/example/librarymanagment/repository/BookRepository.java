package com.example.librarymanagment.repository;

import com.example.librarymanagment.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}