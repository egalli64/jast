/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s3;

import java.util.stream.Stream;

/**
 * Three stream factory methods
 */
public class StreamFactories {
    public static void main(String[] args) {
        // empty()
        System.out.println("An empty stream performs no processing!");
        Stream.empty().forEach(System.out::println);
        System.out.println("---");

        // of() with no arguments
        System.out.println("Passing no argument to of() generates an empty stream");
        Stream.of().forEach(System.out::println);
        System.out.println("---");

        // of() plain usage
        System.out.println("Usually 1+ arguments are passed to of():");
        Stream.of(12, 34).forEach(System.out::println);
        System.out.println("---");

        // of() with nulls among parameters (dangerous)
        System.out.println("Passing a null among the arguments to of() is legal but dangerous:");
        Stream.of(null, 12).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Passing an array to of() works in a reasonable way:");
        Stream.of(new Integer[] { 42, null }).forEach(System.out::println);
        System.out.println("---");

        // of() with a single null is interpreted as a null array!
        // an explicit cast let the compiler understand what we really want
        System.out.print("However passing a null to of() could lead to unexpected behavior: ");
        Stream.of((String) null).forEach(System.out::println);
        System.out.println("---");

        // ofNullable() is safer albeit limited to 0/1 elements
        System.out.print("Passing a 'good' element to ofNullable(): ");
        Stream.ofNullable("Hello").forEach(System.out::println);
        System.out.print("Passing a null to ofNullable() generates an empty stream");
        Stream.ofNullable(null).forEach(System.out::println);
    }
}
