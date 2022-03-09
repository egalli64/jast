package com.example.jast.s12;

import java.util.List;
import java.util.stream.Collectors;

public class DogReducing {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Tom Hanks", 7, 12.5), //
                new Dog("Tom", "Bob Marley", 5, 4.3), //
                new Dog("Kim", "Wim Wenders", 4, 8.1) //
        );

        System.out.println("Dogs: " + dogs);
        System.out.println("---");

        System.out.print("Sum weights by reducing collector: ");
        System.out.println(dogs.stream().collect(Collectors.reducing(0.0, Dog::weight, Double::sum)));

        System.out.print("Same, using summingDouble collector: ");
        System.out.println(dogs.stream().collect(Collectors.summingDouble(Dog::weight)));
        System.out.print("Same, by map-reduce with DoubleStream::sum(): ");
        System.out.println(dogs.stream().mapToDouble(Dog::weight).sum());
        System.out.println("---");

        System.out.print("Average age by reducing collector: ");
        int sum = dogs.stream().collect(Collectors.reducing(0, Dog::age, Integer::sum));
        System.out.println(dogs.isEmpty() ? 0 : sum / (double) dogs.size());

        System.out.print("Same, using averagingInt collector: ");
        System.out.println(dogs.stream().collect(Collectors.averagingInt(Dog::age)));
        System.out.print("Same, by map-reduce with IntStream::average(): ");
        dogs.stream().mapToInt(Dog::age).average().ifPresent(System.out::println);
        System.out.println("---");

        System.out.println("All owners: " + dogs.stream().map(Dog::owner).collect(Collectors.joining(", ")));
        System.out.print("All owners in brackets: ");
        System.out.println(dogs.stream().map(Dog::owner).collect(Collectors.joining(", ", "[", "]")));
    }
}
