/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s02;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * How to stream a partial array
 */
public class ArrayRangeToStream {
    public static void main(String[] args) {
        String[] data = { "not interesting", "first", "second", "third", "not interesting" };
        System.out.println("Array -> Stream on a range in the array -> operate on it");
        Stream<String> stream = Arrays.stream(data, 1, data.length - 1);
        stream.forEach(System.out::println);
    }
}
