package com.example.jast.s02;

import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamBuilder {
    public static void main(String[] args) {
        Builder<String> builder = Stream.builder();

        String[] data = { "one", "two", "three" };
        for (String s : data) {
            builder.accept(s);
        }

        System.out.println("Print each element in the stream built accepting strings (from an array)");
        builder.build().forEach(System.out::println);
        System.out.println("---");

        System.out.println("Print each element in the stream built adding 12, 34, 2 to it");
        Stream.<Integer>builder().add(42).add(34).add(2).build().forEach(System.out::println);
        System.out.println("---");
    }
}
