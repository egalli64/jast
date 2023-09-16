/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s07;

import java.util.List;

/**
 * Terminal operations: findAny, findFirst
 */
public class Finding {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println("The data: " + data);

        data.stream().filter(x -> x % 2 == 0).findAny() //
                .ifPresent(x -> System.out.println("There is at least an even element: " + x));

        data.stream().filter(x -> x % 2 == 0).findFirst() //
                .ifPresent(x -> System.out.println("The first even element is: " + x));

        data.stream().filter(x -> x < 0).findAny().ifPresentOrElse(System.out::println, () -> {
            System.out.println("No negative value found");
        });
    }
}
