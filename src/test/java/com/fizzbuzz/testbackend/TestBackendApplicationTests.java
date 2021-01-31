package com.fizzbuzz.testbackend;

import com.fizzbuzz.testbackend.model.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void itShouldReturnTheGivenNumber() {
        String[] arr = { "1", "2"};
        List<String> list = Arrays.asList(arr);
        assertEquals(list, fizzBuzz.toFizzBuzz(1));
    }

    @Test
    public void itShouldReturnFizzWhenTheGivenNumberIsAMultipleOf3() {
        String[] arr = { "1", "2", "3", "Fizz"};
        List<String> list = Arrays.asList(arr);
        assertEquals(list, fizzBuzz.toFizzBuzz(3));
    }

    @Test
    public void itShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf5() {
        String[] arr = { "1", "2", "3", "4", "5", "Buzz"};
        List<String> list = Arrays.asList(arr);
        assertEquals(list, fizzBuzz.toFizzBuzz(5));
    }

    @Test
    public void itShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        String[] arr = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "FizzBuzz"};
        List<String> list = Arrays.asList(arr);
        assertEquals(list, fizzBuzz.toFizzBuzz(15));
    }

    @Test
    public void itShouldReturnNumberPlusOneWhenTheGivenNumberIsNotAMultipleOf3And5() {
        String[] arr = { "1", "2", "3", "4", "5", "6", "7", "8"};
        List<String> list = Arrays.asList(arr);
        assertEquals(list, fizzBuzz.toFizzBuzz(7));
    }

}
