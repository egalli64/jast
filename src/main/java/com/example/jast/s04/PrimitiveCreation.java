package com.example.jast.s04;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

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
