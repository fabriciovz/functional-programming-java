package com.fabribraguev;

import java.util.List;

public class FP01FunctionalV6 {
    public static void main(String[] args) {
        System.out.println("Hello world Functional V2!");

        List<String> courses = List.of("Spring","Spring boot", "API", "Microservices", "AWS", "Azure", "Docker", "Kubernetes");

        //courses.stream().forEach(System.out::println);

        /*courses.stream()
                .filter(course -> course.contains("Spring")).
                forEach(System.out::println);*/

        courses.stream()
                .filter(course -> course.length() >= 4).
                forEach(System.out::println);

    }
}