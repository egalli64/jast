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
        System.out.println("Print each element in the stream of 12, 34, 2");
        Stream.of(12, 34, 2).forEach(System.out::println);
        System.out.println("---");

        System.out.println("An empty stream performs no processing!");
        Stream.empty().forEach(System.out::println);
        System.out.println("---");

        String[] elements = { "Hello", null };
        for (String element : elements) {
            System.out.println("A nullable stream has one or no elements:");
            Stream<String> stream = Stream.ofNullable(element);
            stream.forEach(System.out::println);
            System.out.println("---");
        }
    }
}
