package com.hufflepuff.generation.italy.BookIn.model.data.abstractions;

import com.hufflepuff.generation.italy.BookIn.model.entities.Book;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends GenericRepository<Book> {
    Iterable<Book> findByTitleContains(String part);

    Iterable<Book> findByAuthorContains(String partName);

    List<Book> findAll();

    Optional<List<Book>> findByYearBetween(LocalDate a, LocalDate b);
    Iterable<Book> findByLanguageLike(String part);


}