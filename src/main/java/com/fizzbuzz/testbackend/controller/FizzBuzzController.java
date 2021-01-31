package com.fizzbuzz.testbackend.controller;

import com.fizzbuzz.testbackend.exception.CustomException;
import com.fizzbuzz.testbackend.model.FizzBuzz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FizzBuzzController {

    private final FizzBuzz fizzBuzz;


    @Autowired
    public FizzBuzzController(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }


    @GetMapping("/")
    public String hello() {
        return "Spring Boot Fizz Buzz";
    }

    @GetMapping(value = "/{number}", produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<String>> fizzBuzz (@PathVariable("number") int number)  throws CustomException {
        if (number <= 0 || String.valueOf(number).length() > 3) {
            throw new CustomException();
        } else {
            return new ResponseEntity<>(fizzBuzz.toFizzBuzz(number), HttpStatus.OK);
        }
    }



}
