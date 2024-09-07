/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s08;

import java.util.Arrays;
import java.util.List;

import com.example.jast.dto.rec.Dog;

/**
 * Using the map and flat map intermediate operations to transform data
 */
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
