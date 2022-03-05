package com.example.jast;

import java.util.Arrays;
import java.util.stream.Stream;

public class RangeArrayToStream {
    public static void main(String[] args) {
        String[] data = { "not interesting", "first", "second", "third", "not interesting" };
        System.out.println("Array -> Stream on a range in the array -> operate on it");
        Stream<String> stream = Arrays.stream(data, 1, data.length - 1);
        stream.forEach(System.out::println);
    }
}
