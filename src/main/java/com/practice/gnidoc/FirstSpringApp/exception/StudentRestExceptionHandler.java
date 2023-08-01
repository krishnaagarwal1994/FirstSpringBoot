package com.practice.gnidoc.FirstSpringApp.exception;

import com.practice.gnidoc.FirstSpringApp.entity.StudentErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<StudentErrorInfo>handleException(StudentNotFoundException exception) {
        System.out.println("Exception handler called");
        StudentErrorInfo error = new StudentErrorInfo("Something wrong with the request", "Try again in sometime");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
