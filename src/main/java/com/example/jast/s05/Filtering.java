package com.example.jast.s05;

import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("Filtering out duplicates by distinct()");
        values.stream().distinct().forEach(System.out::println);

        System.out.println("Filtering out after first elements by limit()");
        values.stream().limit(3).forEach(System.out::println);

        System.out.println("Filtering out first elements by limit()");
        values.stream().skip(3).forEach(System.out::println);

        System.out.println("Filtering out duplicates by distinct() then skip() the first element");
        values.stream().distinct().skip(1).forEach(System.out::println);

    }
}
