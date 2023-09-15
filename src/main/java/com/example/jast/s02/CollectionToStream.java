/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s02;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * How to stream a collection
 */
public class CollectionToStream {
    public static void main(String[] args) {
        Collection<String> data = List.of("first", "second", "third");
        System.out.println("Collection -> Stream -> operate on it");
        Stream<String> stream = data.stream();
        stream.forEach(System.out::println);
    }
}
