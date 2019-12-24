package com.JDBCTraining.library.repository;

import com.JDBCTraining.library.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
