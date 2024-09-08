/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s3;

import java.util.stream.IntStream;

/**
 * Primitive stream generation by Stream.builder()
 */
public class StreamBuilder3Primitive {
    public static void main(String[] args) {
        System.out.println("Create a primitive stream and print its values:");
        IntStream.builder().add(42).add(34).add(2).build().forEach(System.out::println);
    }
}
