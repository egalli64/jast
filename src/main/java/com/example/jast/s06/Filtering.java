package com.example.jast.s06;

import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("Filter to keep the even ones: ");
        values.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Printing values while odd");
        values.stream().takeWhile(x -> x % 2 == 1).forEach(System.out::println);

        System.out.println("Discard the initial odd values");
        values.stream().dropWhile(x -> x % 2 == 1).forEach(System.out::println);
    }
}
