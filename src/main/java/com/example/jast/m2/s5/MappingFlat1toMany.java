/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s5;

import java.util.Arrays;
import java.util.List;

/**
 * Using the flatMap intermediate operation to split each element in many ones
 */
public class MappingFlat1toMany {
    public static void main(String[] args) {
        List<String> names = List.of("Tom Bob", "Joe Syd", "Tim Jim");
        System.out.println("The data source: " + names);

        System.out.println("Flat map the split names, sort and print them:");
        names.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).sorted().forEach(System.out::println);
    }
}
