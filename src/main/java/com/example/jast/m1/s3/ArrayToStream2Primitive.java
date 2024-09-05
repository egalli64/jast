/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s3;

import java.util.Arrays;

/**
 * How to stream a primitive array (int, long, or double)
 */
public class ArrayToStream2Primitive {
    public static void main(String[] args) {
        System.out.println("Using an IntStream, primitive integer stream:");
        int[] intValues = { 1, 2, 3 };
        Arrays.stream(intValues).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Using a LongStream, primitive long stream:");
        long[] longValues = { 1, 2, 3 };
        Arrays.stream(longValues).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Using a DoubleStream, primitive double stream:");
        double[] doubleValues = { 1.0, 2.0, 3.0 };
        Arrays.stream(doubleValues).forEach(System.out::println);

        // won't compile: only int, long and double are supported
//        Arrays.stream(new float[] {});
    }
}
