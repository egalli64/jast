/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s4;

import java.util.stream.IntStream;

/**
 * Two stream factory methods (for primitives)
 */
public class PrimitiveStreamFactories {
    public static void main(String[] args) {
        // empty()
        System.out.println("An empty stream performs no processing!");
        IntStream.empty().forEach(System.out::println);
        System.out.println("---");

        // of() with no arguments
        System.out.println("Passing no argument to of() generates an empty stream");
        IntStream.of().forEach(System.out::println);
        System.out.println("---");

        // of() plain usage
        System.out.println("Usually 1+ arguments are passed to of():");
        IntStream.of(12, 34).forEach(System.out::println);
        System.out.println("---");

        // of(null) pass the compiler check (Java 21) but fails at runtime!
        System.out.println("Passing null as of() argument is legal but it leads to NPE!");
        try {
            IntStream.of(null);
        } catch (NullPointerException ex) {
            System.err.println(ex);
        }
    }
}
