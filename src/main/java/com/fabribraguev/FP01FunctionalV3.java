package com.fabribraguev;

import java.util.List;

public class FP01FunctionalV3 {
    public static void main(String[] args) {
        System.out.println("Hello world Functional V2!");
        printAllEvenNumbersInListFunctionalV3(List.of(12,9,13,4,6,2,4,12,15));
    }

    public static boolean isEven(int number){
        return number%2==0;
    }

    private static void printAllEvenNumbersInListFunctionalV3(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream().
                filter(FP01FunctionalV3::isEven). //Filter: only allow even numbers
                forEach(System.out::println); //Method reference
    }
}