/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s5;

import java.util.Arrays;

/**
 * Two simple terminal operations: forEach and count
 */
public class TwoTerminalsPrimitive {
    public static void main(String[] args) {
        // terminals on primitive streams
        int[] values = { 11, 34, 2 };

        // count
        long count = Arrays.stream(values).count();
        System.out.println("Using count() to see how many elements are in an int stream: " + count);
        System.out.println();

        // for each
        System.out.println("Using forEach() to print each element in an int stream:");
        Arrays.stream(values).forEach(System.out::println);
    }
}
