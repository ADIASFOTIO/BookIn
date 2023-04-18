package com.hufflepuff.generation.italy.BookIn.model.services.abstractions;

import com.hufflepuff.generation.italy.BookIn.model.entities.Book;

public interface BookService {
    Book save(Book book);
    void delete(long id);
    Book update (Book book);
}
