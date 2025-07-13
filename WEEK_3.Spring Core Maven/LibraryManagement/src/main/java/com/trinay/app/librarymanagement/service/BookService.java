package com.trinay.app.librarymanagement.service;

import com.trinay.app.librarymanagement.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        String details = bookRepository.getBookDetails();
        System.out.println(details);
    }
}
