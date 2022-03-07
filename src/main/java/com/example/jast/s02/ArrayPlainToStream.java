package com.example.jast.s02;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayPlainToStream {
    public static void main(String[] args) {
        String[] data = { "first", "second", "third" };
        System.out.println("array -> Stream -> operate on it");
        Stream<String> stream = Arrays.stream(data);
        stream.forEach(System.out::println);
    }
}
