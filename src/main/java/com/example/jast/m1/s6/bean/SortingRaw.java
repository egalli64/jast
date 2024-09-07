/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m1.s6.bean;

import java.util.Comparator;
import java.util.List;

import com.example.jast.dto.bean.DogRaw;

/**
 * Sorting intermediate operations - Using a non-comparable JavaBean as base class
 */
public class SortingRaw {
    public static void main(String[] args) {
        List<DogRaw> dogs = List.of( //
                new DogRaw("Bob", "Robert Redford"), //
                new DogRaw("Al", "Val Kilmer"), //
                new DogRaw("Fido", "Andrew Scott") //
        );

        System.out.println("A few dogs: " + dogs);
        System.out.println("---");

        try {
            dogs.stream().sorted().forEach(System.out::println);
        } catch (ClassCastException ex) {
            System.out.println("Can't sort these dogs without saying how: " + ex.getClass().getName());
        }
        System.out.println("---");

        System.out.println("Sort the dogs by owner");
        dogs.stream().sorted((l, r) -> l.getOwner().compareTo(r.getOwner())).forEach(System.out::println);
        System.out.println("---");

        System.out.println(" by owner using Comparator.comparing()");
        dogs.stream().sorted(Comparator.comparing(DogRaw::getOwner)).forEach(System.out::println);
        System.out.println("---");
    }
}
