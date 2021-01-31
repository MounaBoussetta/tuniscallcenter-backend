package com.fizzbuzz.testbackend.model;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FizzBuzz {
    public List<String> toFizzBuzz(int n) {

            String [] myIntArray = new String[n+1];

            for (int i = 0; i < myIntArray.length; i++){
                    if(i < myIntArray.length-1){
                            myIntArray[i] = String.valueOf(i+1);
                    }else {
                            if (n % 3 == 0 && n % 5 == 0) {
                                    myIntArray[i] = "FizzBuzz";
                            }

                            if (n % 3 == 0 && n % 5 != 0) {
                                    myIntArray[i] = "Fizz";
                            }

                            if (n % 5 == 0 && n % 3 != 0) {
                                    myIntArray[i] = "Buzz";
                            }
                            if (n % 3 != 0 && n % 5 != 0) {
                                    myIntArray[i] = String.valueOf(n+1);
                            }
                    }

            }

            List<String> list = Arrays.asList(myIntArray);
            return list;

    }

}
