/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s8;

import java.util.List;
import java.util.Optional;

/**
 * A terminal operation: findAny
 */
public class FindAny {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, -11, 67, 100, 15, 83, 45);
        System.out.println("The data: " + data);

        // if - commonly used approach
        data.stream().filter(x -> x % 2 == 0).findAny() //
                .ifPresent(x -> System.out.println("There is at least an even element: " + x));

        // alternative approach, more imperative
        Optional<Integer> evenOpt = data.stream().filter(x -> x % 2 == 0).findAny();
        if (evenOpt.isPresent()) {
            System.out.println("An even element has been found: " + evenOpt.get());
            System.out.println("---");
        }

        // if/else - commonly used approach
        data.stream().filter(x -> x < 0).findAny() //
                .ifPresentOrElse(System.out::println, () -> {
                    System.out.println("No negative value found");
                });

        // alternative approach, more imperative
        Optional<Integer> negOpt = data.stream().filter(x -> x < 0).findAny();
        if (negOpt.isEmpty()) {
            System.out.println("Unexpected, I really thought there was a negative value");
        } else {
            System.out.println("A negative value is " + negOpt.get());
        }
    }
}
