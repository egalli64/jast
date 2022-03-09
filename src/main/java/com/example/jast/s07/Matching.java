package com.example.jast.s07;

import java.util.List;

public class Matching {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println(data);

        if (data.stream().allMatch(x -> x > 0)) {
            System.out.println("All the elements are positive");
        }

        if (data.stream().anyMatch(x -> x % 2 == 0)) {
            System.out.println("There is at least an even element");
        }

        if (data.stream().noneMatch(x -> x > 100)) {
            System.out.println("No element is bigger than 100");
        }

        if (data.stream().filter(x -> x % 2 == 1).allMatch(x -> x < 90)) {
            System.out.println("The odd numbers are all less than 90");
        }

        if (data.stream().filter(x -> x < 0).allMatch(x -> x % 2 == 1)) {
            System.out.println("The negative numbers are all odds (or there is no such a beast)");
        }
    }
}
