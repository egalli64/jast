/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s7;

import java.util.List;

/**
 * Intermediate filtering operations by position: limit, skip
 */
public class PositionalFiltering {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("limit() size to 2:");
        values.stream().limit(2).forEach(System.out::println);
        System.out.println();

        System.out.println("skip() the first 4 elements:");
        values.stream().skip(4).forEach(System.out::println);
        System.out.println();
    }
}
