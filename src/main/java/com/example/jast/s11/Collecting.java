package com.example.jast.s11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Collecting {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 2, 5, -23, 54, -11, 67, -100, 15, -83, 45);
        System.out.println("Values: " + values);
        System.out.println("---");

        System.out.print("Filter positive values, collect by toList(): ");
        System.out.println(values.stream().filter(x -> x > 0).collect(Collectors.toList()));

        System.out.print("Filter positive values, collect by counting(): ");
        System.out.println(values.stream().filter(x -> x > 0).collect(Collectors.counting()));

        System.out.println("Same, using Stream::count(): " + values.stream().filter(x -> x > 0).count());
        System.out.println("---");

        System.out.print("Collect in natural order with maxBy(): ");
        values.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).ifPresent(System.out::println);

        System.out.print("Same, using Stream::max(): ");
        values.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);

        System.out.print("Collect in natural order with minBy(): ");
        values.stream().collect(Collectors.minBy(Comparator.naturalOrder())).ifPresent(System.out::println);

        System.out.print("Same, using Stream::min(): ");
        values.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
