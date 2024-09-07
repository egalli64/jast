/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s7;

import java.util.List;

/**
 * Intermediate filtering operations: filter, takeWhile, dropWhile
 */
public class FilterByPredicate {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("filter() the even values:");
        values.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println();

        System.out.println("filterWhile() odd values, drop from the first even value on:");
        values.stream().takeWhile(x -> x % 2 != 0).forEach(System.out::println);
        System.out.println();

        System.out.println("dropWhile() odd values, keep from the first even value on:");
        values.stream().dropWhile(x -> x % 2 != 0).forEach(System.out::println);
    }
}
