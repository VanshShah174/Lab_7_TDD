package org.example;

public class FizzBuzz {

    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0 ) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "";
            // 5 divisle by 0 comes empty
        } else {
            return String.valueOf(num);
        }
    }
}
