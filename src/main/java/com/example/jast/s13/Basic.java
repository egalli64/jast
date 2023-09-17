/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s13;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Introduction to grouping by collector
 */
public class Basic {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 2, 5, -23, 54, -11, 67, -99, 5, -23, 54);
        System.out.println("Values: " + values);

        System.out.println("Grouped by signum in a map Integer to List:");
        var bySign = values.stream().collect(Collectors.groupingBy(Integer::signum));
        for (var entry : bySign.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        System.out.println("Grouped by signum in a map Integer to TreeSet:");
        var bySignOrederedNoDuplicates = values.stream()
                .collect(Collectors.groupingBy(Integer::signum, Collectors.toCollection(TreeSet::new)));
        for (var entry : bySignOrederedNoDuplicates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        System.out.println("Grouped by signum then parity, map Integer to map boolean to List:");
        var bySignThenParity = values.stream()
                .collect(Collectors.groupingBy(Integer::signum, Collectors.groupingBy(x -> x % 2 == 0)));
        for (var entry : bySignThenParity.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        System.out.println("Grouped by signum then filter even:");
        var bySignThenEven = values.stream().collect(
                Collectors.groupingBy(Integer::signum, Collectors.filtering(x -> x % 2 == 0, Collectors.toList())));
        for (var entry : bySignThenEven.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Grouped by signum then filter even:");
        var filterEvenThenGroupBySign = values.stream().filter(x -> x % 2 == 0)
                .collect(Collectors.groupingBy(Integer::signum));
        for (var entry : filterEvenThenGroupBySign.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        System.out.println("Grouped by signum then add them up:");
        var bySignAdd = values.stream()
                .collect(Collectors.groupingBy(Integer::signum, Collectors.reducing(0, i -> i, Integer::sum)));
        for (var entry : bySignAdd.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        System.out.println("Grouped by signum then count them:");
        var bySignCounting = values.stream().collect(Collectors.groupingBy(Integer::signum, Collectors.counting()));
        for (var entry : bySignCounting.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        System.out.println("Grouped by element, counting, sending the result in a TreeMap:");
        System.out.println(values.stream().collect(Collectors.groupingBy(i -> i, TreeMap::new, Collectors.counting())));
        System.out.println("---");
    }
}
