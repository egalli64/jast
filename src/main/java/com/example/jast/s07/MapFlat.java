package com.example.jast.s07;

import java.util.List;
import java.util.stream.Stream;

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

        System.out.println("Cartesian product");
        li1.stream().sorted() //
                .flatMap(i -> li2.stream().sorted().map(j -> new Pair(i, j))) //
                .forEach(System.out::println);
        System.out.println("---");
    }

}
