/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s6;

import java.util.Arrays;

/**
 * Stateless intermediate peek()
 */
public class StatelessPeek {
    public static void main(String[] args) {
        String[] names = { "Al", "Bob", "Chip" };
        Arrays.stream(names).peek(name -> System.out.println("Processing: " + name)).forEach(System.out::println);
        System.out.println("---");

        // notice that peek() could be optimized out for efficiency!
        long count = Arrays.stream(names).peek(name -> System.out.println("Processing: " + name)).count();
        System.out.println("Number of element processed: " + count);
    }
}
