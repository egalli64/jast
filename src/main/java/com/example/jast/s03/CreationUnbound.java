package com.example.jast.s03;

import java.util.stream.Stream;

public class CreationUnbound {
    public static void main(String[] args) {
        System.out.println("The even numbers - size limited five");
        Stream.iterate(2, x -> x + 2).limit(5).forEach(System.out::println);
        System.out.println("---");

        System.out.println("The odd numbers, terminated when the first one not less than 6 is found");
        Stream.iterate(1, x -> x < 6, x -> x + 2).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Random numbers in [0, 1) - size limited to five");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        System.out.println("---");
    }
}
