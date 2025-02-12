package com.example.librarymanagment.service;

import com.example.librarymanagment.model.LibraryMember;
import com.example.librarymanagment.repository.LibraryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//just checking
import java.util.List;
import java.util.Optional;

@Service
public class LibraryMemberService {
    @Autowired
    private LibraryMemberRepository libraryMemberRepository;

    public List<LibraryMember> getAllMembers() {
        return libraryMemberRepository.findAll();
    }

    public Optional<LibraryMember> getMemberById(Long id) {
        return libraryMemberRepository.findById(id);
    }

    public LibraryMember createMember(LibraryMember member) {
        return libraryMemberRepository.save(member);
    }

    public LibraryMember updateMember(Long id, LibraryMember memberDetails) {
        LibraryMember member = libraryMemberRepository.findById(id).orElseThrow();
        member.setName(memberDetails.getName());
        member.setEmail(memberDetails.getEmail());
        return libraryMemberRepository.save(member);
    }

    public void deleteMember(Long id) {
        libraryMemberRepository.deleteById(id);
    }
}