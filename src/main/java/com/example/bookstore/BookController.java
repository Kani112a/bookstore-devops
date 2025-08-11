package com.example.bookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        return List.of(
                new Book("Atomic Habits", "James Clear", 499.0),
                new Book("Clean Code", "Robert C. Martin", 650.0),
                new Book("The Pragmatic Programmer", "Andrew Hunt", 700.0)
        );
    }
}
