package com.fabribraguev;

import java.util.List;

public class FP01FunctionalV2 {
    public static void main(String[] args) {
        System.out.println("Hello world Functional V2!");
        printAllNumbersInListFunctionalV2(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printAllNumbersInListFunctionalV2(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream().forEach(System.out::println); //Method reference
    }
}