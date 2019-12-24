package com.JDBCTraining.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long Id ;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "numoftimesborrowed", nullable = false)
    private int numOfTimesBorrowed;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "library_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Library library;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfTimesBorrowed() {
        return numOfTimesBorrowed;
    }

    public void setNumOfTimesBorrowed(int numOfTimesBorrowed) {
        this.numOfTimesBorrowed = numOfTimesBorrowed;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book() {
    }

    public Book(String title, String author, int numOfTimesBorrowed, Library library) {
        this.title = title;
        this.author = author;
        this.numOfTimesBorrowed = numOfTimesBorrowed;
        this.library = library;
    }
}
