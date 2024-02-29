package org.example;

public class FizzBuzz {

    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "";

        } else if (num % 3 == 0 ) {
            return "";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
