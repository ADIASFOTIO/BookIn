package com.hufflepuff.generation.italy.BookIn.model.data.abstractions;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository<T> extends JpaRepository<T, Long> {
}
