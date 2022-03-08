package com.example.jast.s07;

import java.util.Comparator;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Robert Redford"), //
                new Dog("Zip", "Val Kilmer"), //
                new Dog("Red", "Robert Redford"), //
                new Dog("Zip", "Andrew Scott"), //
                new Dog("Fido", "Andrew Scott") //
        );
        System.out.println("Dogs are: " + dogs);
        System.out.println("---");

        System.out.println("Map dogs to their distinct owners");
        dogs.stream().map(Dog::owner).distinct().forEach(System.out::println);
        System.out.println("---");

        System.out.println("Map dogs to their distinct owner name lengths, reverse order");
        dogs.stream().map(dog -> dog.owner().length()).distinct() //
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Map dogs to their distinct name length");
        dogs.stream().map(dog -> dog.name().length()).distinct().forEach(System.out::println);
        System.out.println("---");

        System.out.print("Map dogs to their distinct name length, reduce to count them: ");
        System.out.println(dogs.stream().map(dog -> dog.name().length()).distinct().count());
        System.out.println("---");

        System.out.print("Map dogs to their distinct name length, reduce to its max: ");
        System.out.println(dogs.stream().map(dog -> dog.name().length()).distinct().max(Integer::compareTo));
        System.out.println("---");

        System.out.print("Same as above, but mapping to int: ");
        System.out.println(dogs.stream().mapToInt(dog -> dog.name().length()).distinct().max());
        System.out.println("---");

    }
}
