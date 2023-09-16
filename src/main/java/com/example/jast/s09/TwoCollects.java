/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s09;

import java.util.List;

/**
 * Terminal collect examples
 */
public class TwoCollects {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println("Working on: " + data + "\n---");

        CollectSum sum = data.stream() //
                .collect(CollectSum::new, CollectSum::accept, CollectSum::combine);
        System.out.print("Sum of all the elements, by collect(): ");
        System.out.println(sum.get() + "\n---");

        CollectAverage avg = data.stream() //
                .collect(CollectAverage::new, CollectAverage::accept, CollectAverage::combine);
        System.out.print("Average by collect(): ");
        System.out.println(avg.get() + "\n---");
    }
}
