/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s2;

import java.util.stream.Stream;

/**
 * Unbounded stream by iterate
 */
public class StreamIterate {
    public static void main(String[] args) {
        System.out.println("Natural sequence - by iterate() + limit(5)");
        Stream.iterate(1, x -> x + 1).limit(5).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Natural sequence - by iterate() with predicate 'less then 6'");
        Stream.iterate(1, x -> x < 6, x -> x + 1).forEach(System.out::println);
        System.out.println("---");
    }
}
