package com.example.librarymanagment.repository;

import com.example.librarymanagment.model.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryMemberRepository extends JpaRepository<LibraryMember, Long> {
}