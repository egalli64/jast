/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s03;

import java.util.stream.IntStream;

/**
 * Complex primitive stream generation by Stream::builder()
 */
public class StreamBuilder {
    public static void main(String[] args) {
        IntStream.Builder builder = IntStream.builder();

        int[] data = { 1, 2, 3 };
        for (int cur : data) {
            builder.accept(cur);
        }

        System.out.println("Print each element in the stream built accepting integers (from an array)");
        builder.build().forEach(System.out::println);
        System.out.println("---");

        System.out.println("Print each element in the stream built adding 12, 34, 2 to it");
        IntStream.builder().add(42).add(34).add(2).build().forEach(System.out::println);
        System.out.println("---");
    }
}
