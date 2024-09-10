/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m3.s1;

import java.util.List;

/**
 * Using the collect terminal operation to get:
 * <ul>
 * <li>sum
 * <li>average
 */
public class Collecting {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println("Working on: " + data);

        CustomCollectorSum sum = data.stream() //
                .collect(CustomCollectorSum::new, //
                        CustomCollectorSum::accumulate, //
                        CustomCollectorSum::combine);
        System.out.println("Sum is " + sum.get());

        CustomCollectorAverage avg = data.stream() //
                .collect(CustomCollectorAverage::new, //
                        CustomCollectorAverage::accumulate, //
                        CustomCollectorAverage::combine);
        System.out.println("Average is " + avg.get());
    }
}
