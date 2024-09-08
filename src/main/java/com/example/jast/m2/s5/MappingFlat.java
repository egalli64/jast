/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s5;

import java.util.List;
import java.util.stream.Stream;

/**
 * Using the flatMap intermediate operation
 */
public class MappingFlat {
    public static void main(String[] args) {
        List<Integer> li1 = List.of(4, 45, 18);
        System.out.println("list one: " + li1);

        List<Integer> li2 = List.of(14, 5, 81);
        System.out.println("list two: " + li2);
        System.out.println("---");

        System.out.println("Using flatMap() to merge (and sort) the two lists:");
        Stream.of(li1, li2).flatMap(List<Integer>::stream).sorted().forEach(System.out::println);
    }
}
