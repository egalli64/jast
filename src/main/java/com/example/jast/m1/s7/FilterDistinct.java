/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s7;

import java.util.List;

/**
 * Intermediate filtering operations, drop duplicates: distinct
 */
public class FilterDistinct {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("Keeping only distinct() elements");
        values.stream().distinct().forEach(System.out::println);
    }
}
