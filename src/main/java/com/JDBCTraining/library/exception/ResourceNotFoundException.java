package com.JDBCTraining.library.exception;

public class ResourceNotFoundException extends Exception {

    public ResourceNotFoundException (String Borrow){

        super(Borrow);
    }
}
