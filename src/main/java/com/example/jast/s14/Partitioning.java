/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.jast.dto.DogExt;
import com.example.jast.dto.Weight;

/**
 * Partitioning examples on user record
 */
public class Partitioning {
    private static final Function<DogExt, Weight> dogWeight = dog -> {
        double current = dog.weight();
        if (current < 3) {
            return Weight.LIGHT;
        } else if (current < 10) {
            return Weight.MEDIUM;
        } else {
            return Weight.HEAVY;
        }        
    };

    private static final Predicate<DogExt> isYoung = dog -> dog.age() < 5;

    public static void main(String[] args) {        
        DogExt[] dogs = { //
                new DogExt("Bob", "Tom Hanks", 7, 12.5), //
                new DogExt("Tom", "Bob Marley", 5, 4.3), //
                new DogExt("Kim", "Wim Wenders", 4, 8.1), //
                new DogExt("Kim", "Tom Hanks", 3, 2.5) //
        };
        System.out.println("Dogs: " + Arrays.toString(dogs));

        // partitioning
        Map<Boolean, List<DogExt>> dogsByAge = Arrays.stream(dogs).collect(Collectors.partitioningBy(isYoung));
        System.out.println("Dogs partitioned by age: " + dogsByAge);

        // just filtering
        System.out.println("Only young dogs: " + Arrays.stream(dogs).filter(isYoung).collect(Collectors.toList()));

        // partitioning then grouping
        Map<Boolean, Map<Weight, List<DogExt>>> dogsByKimNameAndOwner = Arrays.stream(dogs)
                .collect(Collectors.partitioningBy(isYoung, Collectors.groupingBy(dogWeight)));
        System.out.println("Dogs partitioned by age and weight: " + dogsByKimNameAndOwner);
    }
}
