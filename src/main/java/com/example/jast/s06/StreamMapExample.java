package com.example.jast.s06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Red", "Robert Redford"), //
                new Dog("Zip", "Val Kilmer"), //
                new Dog("Fido", "Andrew Scott") //
        );
        System.out.println("Dogs are: " + dogs);

        System.out.println("Dog owners");
        dogs.stream().map(Dog::owner).forEach(System.out::println);

        System.out.println("Sorted owner name lengths");
        dogs.stream().map(dog -> dog.owner().length()) //
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.print("Owners characters, lower case, no duplicates >");
        dogs.stream().map(Dog::owner).map(s -> s.split("")) //
                .flatMap(Arrays::stream).map(String::toLowerCase).distinct().forEach(System.out::print);
        System.out.println('<');
    }
}
