package com.fizzbuzz.testbackend.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> myMessage(CustomException c){
        return new ResponseEntity<>(c.getMessage(), HttpStatus.BAD_REQUEST) ;
    }

}
