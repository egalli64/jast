/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s2;

import java.util.stream.Stream;

/**
 * Unbounded stream by generate
 */
public class StreamGenerate {
    public static void main(String[] args) {
        System.out.println("Random numbers in [0, 1) - by generate() + limit(5)");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}
