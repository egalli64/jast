/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s05;

import java.util.Comparator;
import java.util.List;

import com.example.jast.dto.DogBean;

/**
 * Stateful intermediate sort: standard, by comparator (lambda and
 * Comparator::comparing) - Using a JavaBean as base class
 */
public class SortingBean {
    public static void main(String[] args) {
        List<DogBean> dogs = List.of( //
                new DogBean("Bob", "Robert Redford"), //
                new DogBean("Al", "Val Kilmer"), //
                new DogBean("Fido", "Andrew Scott") //
        );

        System.out.println("A few dogs: " + dogs);
        System.out.println("---");

        System.out.println("Sort the dogs, then print each of them");
        dogs.stream().sorted().forEach(System.out::println);
        System.out.println("---");

        System.out.println("Sort the dogs by owner, then print each of them");
        dogs.stream().sorted((l, r) -> l.getOwner().compareTo(r.getOwner())).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Sort the dogs by owner using Comparator.comparing(), then print each of them");
        dogs.stream().sorted(Comparator.comparing(DogBean::getOwner)).forEach(System.out::println);
        System.out.println("---");
    }
}
