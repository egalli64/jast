/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s5;

import java.util.Arrays;
import java.util.List;

/**
 * Using the map intermediate operation
 */
public class Mapping {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 45, 18);
        System.out.println("An integer list: " + values);

        System.out.println("Map to square:");
        values.stream().map(x -> x * x).forEach(System.out::println);
        System.out.println("---");

        String[] data = { "Some", "strings", "where", "one", "is", "", "empty" };
        System.out.println("A string list: " + Arrays.toString(data));

        System.out.println("Map to length, then sort:");
        Arrays.stream(data).mapToInt(String::length).sorted().forEach(System.out::println);
        System.out.println("---");
    }
}
