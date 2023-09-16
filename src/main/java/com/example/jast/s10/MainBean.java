/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s10;

import java.util.List;
import java.util.Set;

import com.example.jast.dto.DogBean;

/**
 * Collecting using a specialized collector (JavaBean based)
 */
public class MainBean {
    public static void main(String[] args) {
        List<DogBean> dogs = List.of( //
                new DogBean("Bob", "Robert Redford"), //
                new DogBean("Zip", "Val Kilmer"), //
                new DogBean("Red", "Robert Redford"), //
                new DogBean("Zip", "Andrew Scott"), //
                new DogBean("Fido", "Andrew Scott") //
        );

        System.out.println("Dogs are: " + dogs);
        System.out.println("---");

        Set<String> owners = dogs.stream().collect(new DogOwnerCollectorBean());
        System.out.println("Owners are: " + owners);
        System.out.println("---");
    }
}
