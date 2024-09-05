/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s3;

import java.util.Collection;
import java.util.List;

/**
 * How to stream a collection
 */
public class CollectionToStream {
    public static void main(String[] args) {
        Collection<String> data = List.of("first", "second", "third");
        System.out.println("Collection -> Stream -> operate on it:");
        data.stream().forEach(System.out::println);
    }
}
