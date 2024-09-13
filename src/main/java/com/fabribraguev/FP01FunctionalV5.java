package com.fabribraguev;

import java.util.List;

public class FP01FunctionalV5 {
    public static void main(String[] args) {
        System.out.println("Hello world Functional V2!");
        printAllOddNumbersInListFunctionalV4(List.of(12,9,13,4,6,2,4,12,15));
    }
    private static void printAllOddNumbersInListFunctionalV4(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream().
                filter( number -> number%2 == 1 ). //Lambda expression // or number%2 != 0
                forEach(System.out::println); //Method reference
    }
}