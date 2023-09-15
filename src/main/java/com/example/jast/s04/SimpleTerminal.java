/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s04;

import java.util.List;

/**
 * Terminal operations: forEach and count
 */
public class SimpleTerminal {
    public static void main(String[] args) {
        List<Integer> values = List.of(11, 34, 2);

        System.out.println("Print each element in the stream - forEach()");
        values.stream().forEach(System.out::println);

        long count = values.stream().count();
        System.out.println("Count values in the stream - count(): " + count);
    }
}
