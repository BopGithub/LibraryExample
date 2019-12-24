package com.JDBCTraining.library.repository;

import com.JDBCTraining.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
