/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s6.bean;

import java.util.Comparator;
import java.util.List;

import com.example.jast.dto.bean.Dog;

/**
 * Sorting intermediate operations - Using a JavaBean as base class
 */
public class Sorting {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Robert Redford"), //
                new Dog("Al", "Val Kilmer"), //
                new Dog("Fido", "Andrew Scott") //
        );

        System.out.println("A few dogs: " + dogs);
        System.out.println("---");

        System.out.println("Sort the dogs in natural order");
        dogs.stream().sorted().forEach(System.out::println);
        System.out.println("---");

        System.out.println(" by owner");
        dogs.stream().sorted((l, r) -> l.getOwner().compareTo(r.getOwner())).forEach(System.out::println);
        System.out.println("---");

        System.out.println(" by owner using Comparator.comparing()");
        dogs.stream().sorted(Comparator.comparing(Dog::getOwner)).forEach(System.out::println);
        System.out.println("---");
    }
}
