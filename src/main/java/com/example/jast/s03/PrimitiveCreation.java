/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s03;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Create a primitive stream from a sequence, and an empty stream
 */
public class PrimitiveCreation {
    public static void main(String[] args) {
        System.out.println("Print each element in the stream of 12, 34, 2");
        IntStream.of(12, 34, 2).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Print each element in the empty stream");
        DoubleStream.empty().forEach(System.out::println);
        System.out.println("---");
    }
}
