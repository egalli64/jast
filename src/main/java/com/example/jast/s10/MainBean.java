/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s10;

import java.util.List;
import java.util.Set;

import com.example.jast.dto.bean.Dog;

/**
 * Collecting using a specialized collector (JavaBean based)
 */
public class MainBean {
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

        Set<String> owners = dogs.stream().collect(new DogOwnerCollectorBean());
        System.out.println("Owners are: " + owners);
        System.out.println("---");
    }
}
