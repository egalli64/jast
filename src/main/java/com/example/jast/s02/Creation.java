package com.example.jast.s02;

import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {
        System.out.println("Print each element in the stream of 12, 34, 2");
        Stream.of(12, 34, 2).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Print each element in the empty stream");
        Stream.empty().forEach(System.out::println);
        System.out.println("---");

        String[] elements = { "Hello", null };
        for (String element : elements) {
            System.out.println("Print each element in the stream created from an element possibly null");
            Stream.ofNullable(element).forEach(System.out::println);
            System.out.println("---");
        }
    }
}
