package com.epam.mjc;

public class StudentNotFindException extends IllegalArgumentException {

    public StudentNotFindException(long studentId) {
        super(String.format("Could not find student with ID %d", studentId));
    }
}
