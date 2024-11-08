package com.example.librarymanagmentsystem.service;

import com.example.librarymanagmentsystem.model.Book;
import com.example.librarymanagmentsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book save (Book book) {
        return bookRepository.save(book);
    }

    public Book findById (Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteById (Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getAllBooks() {
        return null;
    }

    public Book getBookById(Long id) {
        return null;
    }

    public Book createBook(Book book) {
        return null;
    }

    public Book updateBook(Long id, Book book) {
        return null;
    }

    public void deleteBook(Long id) {

    }

}
