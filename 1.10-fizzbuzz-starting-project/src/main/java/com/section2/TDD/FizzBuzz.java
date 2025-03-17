package com.section2.TDD;

public class FizzBuzz {

    public String compute(int number){
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        } else if(number % 3 == 0){
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
