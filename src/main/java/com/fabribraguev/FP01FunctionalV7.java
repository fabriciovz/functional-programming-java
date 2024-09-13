package com.fabribraguev;

import java.util.List;

public class FP01FunctionalV7 {
    public static void main(String[] args) {
        printAllSquareOfEvenNumbersInListFunctionalV4(List.of(12,9,13,4,6,2,4,12,15));
    }
    private static void printAllSquareOfEvenNumbersInListFunctionalV4(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream().
                filter( number -> number%2 == 0 ). //Lambda expression
                map( number -> number * number ). //mapping x -> x * x
                forEach(System.out::println); //Method reference
    }
}