/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s02;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * How to stream a primitive array (int, long, or double)
 */
public class ArrayPrimitiveToStream {
    public static void main(String[] args) {
        System.out.println("int[] -> IntStream");
        IntStream is = Arrays.stream(new int[] { 1, 2, 3 });
        is.forEach(System.out::println);

        System.out.println("long[] -> LongStream");
        LongStream ls = Arrays.stream(new long[] { 1, 2, 3 });
        ls.forEach(System.out::println);

        System.out.println("double[] -> DoubleStream");
        DoubleStream ds = Arrays.stream(new double[] { 1.0, 2.0, 3.0 });
        ds.forEach(System.out::println);
    }
}
