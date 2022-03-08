package com.example.jast.s07;

import java.util.Arrays;
import java.util.List;

public class MapThenMapFlat {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Robert Redford"), //
                new Dog("Zip", "Val Kilmer"), //
                new Dog("Fido", "Andrew Scott") //
        );
        System.out.println("Dogs are: " + dogs);

        System.out.print("Map dogs to owner characters, lower case, ordered, no duplicates >");
        dogs.stream().map(Dog::owner).map(s -> s.split("")) //
                .flatMap(Arrays::stream).map(String::toLowerCase) //
                .sorted().distinct().forEach(System.out::print);
        System.out.println('<');
    }
}
