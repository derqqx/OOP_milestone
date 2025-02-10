package com.example.librarymanagment.controller;

import com.example.librarymanagment.model.LibraryMember;
import com.example.librarymanagment.service.LibraryMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/members")
public class LibraryMemberController {
    @Autowired
    private LibraryMemberService libraryMemberService;

    @GetMapping
    public List<LibraryMember> getAllMembers() {
        return libraryMemberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public Optional<LibraryMember> getMemberById(@PathVariable Long id) {
        return libraryMemberService.getMemberById(id);
    }

    @PostMapping
    public LibraryMember createMember(@RequestBody LibraryMember member) {
        return libraryMemberService.createMember(member);
    }

    @PutMapping("/{id}")
    public LibraryMember updateMember(@PathVariable Long id, @RequestBody LibraryMember member) {
        return libraryMemberService.updateMember(id, member);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Long id) {
        libraryMemberService.deleteMember(id);
    }
}