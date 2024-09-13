package com.fabribraguev;

import java.util.List;

public class FP01FunctionalV4 {
    public static void main(String[] args) {
        System.out.println("Hello world Functional V2!");
        printAllEvenNumbersInListFunctionalV4(List.of(12,9,13,4,6,2,4,12,15));
    }
    private static void printAllEvenNumbersInListFunctionalV4(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream().
                filter( number -> number%2 == 0 ). //Lambda expression
                forEach(System.out::println); //Method reference
    }
}