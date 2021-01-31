package com.fizzbuzz.testbackend.exception;

public class CustomException extends Exception {
    public CustomException() {
        super("Number must be between 1 and 999");
    }
}
