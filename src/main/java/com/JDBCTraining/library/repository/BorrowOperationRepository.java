package com.JDBCTraining.library.repository;

import com.JDBCTraining.library.model.BorrowOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowOperationRepository extends JpaRepository<BorrowOperation,Long> {
}
