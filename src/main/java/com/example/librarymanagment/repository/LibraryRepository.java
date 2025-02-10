package com.example.librarymanagment.repository;

import com.example.librarymanagment.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}