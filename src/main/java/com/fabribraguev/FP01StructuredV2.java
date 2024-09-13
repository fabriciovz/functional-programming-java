package com.fabribraguev;

import java.util.List;

public class FP01StructuredV2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printAllEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for(int number:numbers){
            if (number%2==0){
                System.out.println(number);
            }
        }
    }
}