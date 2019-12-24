package com.JDBCTraining.library.repository;

import com.JDBCTraining.library.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,Long> {
}
