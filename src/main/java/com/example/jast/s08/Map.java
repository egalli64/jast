/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s08;

import java.util.Comparator;
import java.util.List;

/**
 * Using the map intermediate operation to transform data
 */
public class Map {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Robert Redford"), //
                new Dog("Zip", "Val Kilmer"), //
                new Dog("Red", "Robert Redford"), //
                new Dog("Zip", "Andrew Scott"), //
                new Dog("Fido", "Andrew Scott") //
        );
        System.out.println("Stream on a list of dogs: " + dogs);

        System.out.println("\nMap each dog to its owner, discard duplicates, print:");
        dogs.stream().map(Dog::owner).distinct().forEach(System.out::println);

        System.out.println("\nMap dogs to their distinct owner name lengths, reverse order, print:");
        dogs.stream().map(dog -> dog.owner().length()).distinct() //
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("\nMap dogs to their distinct name length");
        dogs.stream().map(dog -> dog.name().length()).distinct().forEach(System.out::println);

        System.out.print("\nMap dogs to their distinct name length, reduce to count them: ");
        System.out.println(dogs.stream().map(dog -> dog.name().length()).distinct().count());

        System.out.print("\nMap dogs to their distinct name length, reduce to its max: ");
        System.out.println(dogs.stream() //
                .map(dog -> dog.name().length()) //
                .distinct() //
                .max(Integer::compareTo)); // or: (x, y) -> x.compareTo(y)

        System.out.print("\nSame as above, but mapping to int (primitive): ");
        System.out.println(dogs.stream() //
                .mapToInt(dog -> dog.name().length()) //
                .distinct() //
                .max());
    }
}
