/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s5.rec;

import java.util.Arrays;
import java.util.List;

import com.example.jast.dto.rec.Dog;

/**
 * Using map and flat map intermediate operations on records
 */
public class MapPlusFlatMap {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Robert Redford"), //
                new Dog("Zip", "Val Kilmer"), //
                new Dog("Fido", "Andrew Scott") //
        );
        System.out.println("Dogs are: " + dogs);

        System.out.print("Characters used in their owner names are >");
        dogs.stream() //
                .map(Dog::owner) //
                .flatMap(s -> Arrays.stream(s.split(""))) //
                .map(String::toLowerCase) //
                .distinct() //
                .sorted() //
                .forEach(System.out::print);
        System.out.println('<');
    }
}
