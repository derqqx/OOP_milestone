package com.example.librarymanagment.service;

import com.example.librarymanagment.model.Library;
import com.example.librarymanagment.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//just checking
import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public Optional<Library> getLibraryById(Long id) {
        return libraryRepository.findById(id);
    }

    public Library createLibrary(Library library) {
        return libraryRepository.save(library);
    }

    public Library updateLibrary(Long id, Library libraryDetails) {
        Library library = libraryRepository.findById(id).orElseThrow();
        library.setName(libraryDetails.getName());
        return libraryRepository.save(library);
    }

    public void deleteLibrary(Long id) {
        libraryRepository.deleteById(id);
    }
}