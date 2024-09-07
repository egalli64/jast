/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s6;

import java.util.Comparator;
import java.util.List;

/**
 * Sorting intermediate operations: standard, and by comparator
 */
public class StatefulSorting {
    public static void main(String[] args) {
        List<Integer> values = List.of(3, 6, -6, 2, 1, -3, 5);

        System.out.println("A few values: " + values);
        System.out.println("---");

        System.out.println("Sort the values in natural order");
        values.stream().sorted().forEach(System.out::println);
        System.out.println("---");

        System.out.println(" in reversed order");
        values.stream().sorted((l, r) -> r.compareTo(l)).forEach(System.out::println);
        System.out.println("---");

        System.out.println(" by magnitude (no sign) - by Comparator.comparing()");
        values.stream().sorted(Comparator.comparing(Math::abs)).forEach(System.out::println);
        System.out.println("---");
    }
}
