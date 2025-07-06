package com.trinay.app.librarymanagement2.service;

import com.trinay.app.librarymanagement2.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Spring to inject the dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        String details = bookRepository.getBookDetails();
        System.out.println(details);
    }
}