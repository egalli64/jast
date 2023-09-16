/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s08;

import java.util.List;
import java.util.stream.Stream;

/**
 * Flat map examples
 */
public class MapFlat {
    public static void main(String[] args) {
        List<Integer> li1 = List.of(4, 45, 18);
        System.out.println("list one: " + li1);

        List<Integer> li2 = List.of(14, 5, 81);
        System.out.println("list two: " + li2);
        System.out.println("---");

        System.out.println("Flat map to a single stream, then sort all the values");
        Stream.of(li1, li2).flatMap(List<Integer>::stream).sorted().forEach(System.out::println);
        System.out.println("---");

        // strings and nulls
        String[] data = { "Some ", "good ", "strings ", null, "but ", "also ", "some ", null };

        System.out.print("This is not good: ");
        Stream.of(data).forEach(System.out::print);
        System.out.println("\n---");

        System.out.print("This is better: ");
        Stream.of(data).flatMap(Stream::ofNullable).forEach(System.out::print);
        System.out.println("\n---");
    }
}
