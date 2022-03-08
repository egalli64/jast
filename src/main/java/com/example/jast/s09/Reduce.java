package com.example.jast.s09;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println("Working on: " + data + "\n---");

        System.out.print("Sum of all the elements, the imperative way: ");
        int result = 0;
        for (int value : data) {
            result += value;
        }
        System.out.println(result + "\n---");

        System.out.print("Same, by reduce on a lambda: ");
        System.out.println(data.stream().reduce(0, (x, y) -> x + y));
        System.out.println("---");

        System.out.print("Same, but no identity seed and reducing by Integer::sum: ");
        data.stream().reduce(Integer::sum).ifPresent(z -> System.out.println("Adding up elements by sum: " + z));
        System.out.println("---");

        System.out.print("Same, by sum() - primitive stream required: ");
        System.out.println(data.stream().mapToInt(i -> i).sum());
        System.out.println("---");

        data.stream().reduce(Integer::max).ifPresent(z -> System.out.println("Reduce to get max value: " + z));
        System.out.println("---");

        System.out.print("Mapping even/odd to 0/1, then reduce by sum to count the odd values: ");
        data.stream().map(x -> x % 2 == 0 ? 0 : 1).reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println("---");

        System.out.print("Same, filter to keep the odd values, then count() them: ");
        System.out.println(data.stream().filter(x -> x % 2 == 1).count());
        System.out.println("---");
    }
}
