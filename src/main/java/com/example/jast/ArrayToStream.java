package com.example.jast;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        String[] data = { "first", "second", "third" };
        System.out.println("array -> Stream -> operate on it");
        Stream<String> stream = Arrays.stream(data);
        stream.forEach(System.out::println);
    }
}
