/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s5.rec;

import java.util.Comparator;
import java.util.List;

import com.example.jast.dto.rec.Dog;

/**
 * Using the map intermediate operation on records
 */
public class Mapping {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Robert Redford"), //
                new Dog("Zip", "Val Kilmer"), //
                new Dog("Red", "Robert Redford"), //
                new Dog("Zip", "Andrew Scott"), //
                new Dog("Fido", "Andrew Scott") //
        );
        System.out.println("The stream operates on this list of dogs: " + dogs);

        System.out.println("\nMapping dog to owner:");
        dogs.stream().map(Dog::owner).forEach(System.out::println);

        System.out.println("\nMapping dog to owner + distinct:");
        dogs.stream().map(Dog::owner).distinct().forEach(System.out::println);

        System.out.println("\nMapping dog to name length + distinct:");
        dogs.stream().map(dog -> dog.name().length()).distinct().forEach(System.out::println);

        System.out.println("\nMapping (to int) dog to name length + distinct:");
        dogs.stream().mapToInt(dog -> dog.name().length()).distinct().forEach(System.out::println);

        System.out.println("\nMappint dog to owner length + distinct + sort in reverse order:");
        dogs.stream().map(dog -> dog.owner().length()).distinct() //
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
