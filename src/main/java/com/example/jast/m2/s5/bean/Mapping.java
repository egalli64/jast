/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s5.bean;

import java.util.Comparator;
import java.util.List;

import com.example.jast.dto.bean.Dog;

/**
 * Using the map intermediate operation on JavaBeans
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
        System.out.println("The stream operates on this dogs: " + dogs);

        System.out.println("\nMapping dog to owner:");
        dogs.stream().map(Dog::getOwner).forEach(System.out::println);

        System.out.println("\nMapping dog owner + distinct:");
        dogs.stream().map(Dog::getOwner).distinct().forEach(System.out::println);

        System.out.println("\nMapping dog to name length + distinct:");
        dogs.stream().map(dog -> dog.getName().length()).distinct().forEach(System.out::println);

        System.out.println("\nMapping (to int) dog to name length + distinct:");
        dogs.stream().mapToInt(dog -> dog.getName().length()).distinct().forEach(System.out::println);

        System.out.println("\nMappint dog to owner length + distinct + sort in reverse order:");
        dogs.stream().map(dog -> dog.getOwner().length()).distinct() //
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
