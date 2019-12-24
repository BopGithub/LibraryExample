package com.JDBCTraining.library.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long Id ;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "idNumber", nullable = false)
    private int idNumber;

    @Column(name = "phoneNumber", nullable = false)
    private int phoneNumber;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Student() {
    }

    public Student(String name, int idNumber, int phoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }
}
