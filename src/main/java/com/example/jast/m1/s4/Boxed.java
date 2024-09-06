/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Converting primitive stream to reference stream
 */
public class Boxed {
    public static void main(String[] args) {
        IntStream spi = IntStream.of(1, 2, 3);
        Stream<Integer> si = spi.boxed();
        si.forEach(System.out::println);
        System.out.println("---");

        Stream<Long> sl = LongStream.of(1L, 2L, 3L).boxed();
        sl.forEach(System.out::println);
        System.out.println("---");

        Stream<Double> sd = DoubleStream.of(1.0, 2.0, 3.0).boxed();
        sd.forEach(System.out::println);
        System.out.println("---");
    }
}
