/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s3;

import java.util.stream.Stream;

/**
 * Compact stream generation by Stream.builder() with add()
 */
public class StreamBuilder2Add {
    public static void main(String[] args) {
        System.out.println("Create a stream and print its values:");
        // Notice how we pass the compiler the generic Builder type 
        Stream.<Integer>builder().add(42).add(34).add(2).build().forEach(System.out::println);
    }
}
