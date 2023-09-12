/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s02;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * How to stream an array
 */
public class ArrayPlainToStream {
    public static void main(String[] args) {
        String[] data = { "first", "second", "third" };
        System.out.println("An array: " + Arrays.toString(data));

        Stream<String> stream = Arrays.stream(data);
        System.out.println("\nOperate on an array by stream: " + stream.toString());

        System.out.println("\nPrint each element:");
        stream.forEach(System.out::println);

        System.out.println("\nStream data in an array, print each value:");
        Arrays.stream(data).forEach(System.out::println);
    }
}
