package com.JDBCTraining.library.controller;

import com.JDBCTraining.library.exception.ResourceNotFoundException;
import com.JDBCTraining.library.model.Book;
import com.JDBCTraining.library.model.BorrowOperation;
import com.JDBCTraining.library.model.Student;
import com.JDBCTraining.library.repository.BookRepository;
import com.JDBCTraining.library.repository.BorrowOperationRepository;
import com.JDBCTraining.library.repository.LibraryRepository;
import com.JDBCTraining.library.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BorrowController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LibraryRepository libraryRepository;
    @Autowired
    private BorrowOperationRepository borrowOperationRepository;

    @PostMapping("/reservebook/{student_id}/{book_id}")
    public Map<String, Boolean> reserveBook(@PathVariable Long student_id, @PathVariable Long book_id)
            throws ResourceNotFoundException {

        Book book = bookRepository.findById(book_id)
                .orElseThrow(()-> new ResourceNotFoundException("error"+book_id));

        Student student = studentRepository.findById(student_id)
                .orElseThrow(()-> new ResourceNotFoundException("error"+student_id));

        BorrowOperation borrowOperation = new BorrowOperation();
        borrowOperation.setBook(book);
        borrowOperation.setStudent(student);

        borrowOperationRepository.save(borrowOperation);

        Map<String, Boolean> response = new HashMap<>();
        response.put("reserved",Boolean.TRUE);
        return response;
    }

}
