package com.example.jast;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveArrayToStream {
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
