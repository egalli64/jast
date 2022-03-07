package com.example.jast.s05;

import java.util.List;

import java.util.Comparator;

public class VariousCombinations {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("Three biggest values");
        values.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        System.out.println("No duplicates, sort, first three values");
        values.stream().distinct().sorted().limit(3).forEach(System.out::println);

        System.out.println("No duplicates, sort, values after first three ones");
        values.stream().distinct().sorted().skip(3).forEach(System.out::println);
    }
}
