/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s08;

import java.util.Arrays;
import java.util.List;

import com.example.jast.dto.DogBean;

/**
 * Using the map and flat map intermediate operations to transform data - using
 * JavaBeans
 */
public class MapThenMapFlatBean {
    public static void main(String[] args) {
        List<DogBean> dogs = List.of( //
                new DogBean("Bob", "Robert Redford"), //
                new DogBean("Zip", "Val Kilmer"), //
                new DogBean("Fido", "Andrew Scott") //
        );
        System.out.println("Dogs are: " + dogs);

        System.out.print("Map dogs to owner characters, lower case, ordered, no duplicates >");
        dogs.stream().map(DogBean::getOwner).map(s -> s.split("")) //
                .flatMap(Arrays::stream).map(String::toLowerCase) //
                .sorted().distinct().forEach(System.out::print);
        System.out.println('<');
    }
}
