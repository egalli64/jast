/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s8;

import java.util.List;
import java.util.Optional;

/**
 * A terminal operation: findFirst
 */
public class FindFirst {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, -11, 67, 100, 15, 83, 45);
        System.out.println("The data: " + data);

        // if - commonly used approach
        data.stream().filter(x -> x % 2 == 0).findFirst() //
                .ifPresent(x -> System.out.println("The first even element: " + x));

        // alternative approach, more imperative
        Optional<Integer> evenOpt = data.stream().filter(x -> x % 2 == 0).findFirst();
        if (evenOpt.isPresent()) {
            System.out.println("The first even element: " + evenOpt.get());
            System.out.println("---");
        }

        // if/else - commonly used approach
        data.stream().filter(x -> x < 0).findFirst() //
                .ifPresentOrElse(System.out::println, () -> {
                    System.out.println("No negative value found");
                });

        // alternative approach, more imperative
        Optional<Integer> negOpt = data.stream().filter(x -> x < 0).findFirst();
        if (negOpt.isEmpty()) {
            System.out.println("Unexpected, I really thought there was a negative element");
        } else {
            System.out.println("The first negative element is " + negOpt.get());
        }
    }
}
