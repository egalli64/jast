/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s5;

import java.util.List;

/**
 * Two simple terminal operations: forEach and count
 */
public class TwoTerminals {
    public static void main(String[] args) {
        // terminals on reference streams
        List<Integer> data = List.of(11, 34, 2);

        // count
        long count = data.stream().count();
        System.out.println("Using count() to see how many elements are in an Integer stream: " + count);
        System.out.println();

        // for each
        System.out.println("Using forEach() to print each element in an Integer stream:");
        data.stream().forEach(System.out::println);
    }
}
