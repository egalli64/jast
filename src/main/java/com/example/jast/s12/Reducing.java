/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s12;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Plain usage example for collect using the collector reducing, compare it with
 * using reduce
 */
public class Reducing {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 2, 5, -23, 54, -11, 67, -100, 15, -83, 45);
        System.out.println("Values: " + values);

        System.out.println("Sum by reducing: "
                + values.stream().collect(Collectors.reducing(0, Function.identity(), Integer::sum)));

        System.out.println("Sum by reduce(): " + values.stream().reduce(0, Integer::sum));
        System.out.println("Sum by reduce() - optional: " + values.stream().reduce(Integer::sum));
    }
}
