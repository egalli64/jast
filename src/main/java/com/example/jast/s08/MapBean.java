/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s08;

import java.util.Comparator;
import java.util.List;

import com.example.jast.dto.DogBean;

/**
 * Using the map intermediate operation to transform data - working on JavaBeans
 */
public class MapBean {
    public static void main(String[] args) {
        List<DogBean> dogs = List.of( //
                new DogBean("Bob", "Robert Redford"), //
                new DogBean("Zip", "Val Kilmer"), //
                new DogBean("Red", "Robert Redford"), //
                new DogBean("Zip", "Andrew Scott"), //
                new DogBean("Fido", "Andrew Scott") //
        );
        System.out.println("Stream on a list of dogs: " + dogs);

        System.out.println("\nMap each dog to its owner, discard duplicates, print:");
        dogs.stream().map(DogBean::getOwner).distinct().forEach(System.out::println);

        System.out.println("\nMap dogs to their distinct owner name lengths, reverse order, print:");
        dogs.stream().map(dog -> dog.getOwner().length()).distinct() //
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("\nMap dogs to their distinct name length");
        dogs.stream().map(dog -> dog.getName().length()).distinct().forEach(System.out::println);

        System.out.print("\nMap dogs to their distinct name length, reduce to count them: ");
        System.out.println(dogs.stream().map(dog -> dog.getName().length()).distinct().count());

        System.out.print("\nMap dogs to their distinct name length, reduce to its max: ");
        System.out.println(dogs.stream() //
                .map(dog -> dog.getName().length()) //
                .distinct() //
                .max(Integer::compareTo)); // or: (x, y) -> x.compareTo(y)

        System.out.print("\nSame as above, but mapping to int (primitive): ");
        System.out.println(dogs.stream() //
                .mapToInt(dog -> dog.getName().length()) //
                .distinct() //
                .max());
    }
}
