package com.example.jast.s14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Partitioning {
    private static final Function<Dog, Weight> dogWeight = dog -> {
        double current = dog.weight();
        if (current < 3) {
            return Weight.LIGHT;
        } else if (current < 10) {
            return Weight.MEDIUM;
        } else {
            return Weight.HEAVY;
        }
    };

    private static final Predicate<Dog> isYoung = dog -> dog.age() < 5;

    public static void main(String[] args) {
        Dog[] dogs = { //
                new Dog("Bob", "Tom Hanks", 7, 12.5), //
                new Dog("Tom", "Bob Marley", 5, 4.3), //
                new Dog("Kim", "Wim Wenders", 4, 8.1), //
                new Dog("Kim", "Tom Hanks", 3, 2.5) //
        };
        System.out.println("Dogs: " + Arrays.toString(dogs));

        // partitioning
        Map<Boolean, List<Dog>> dogsByAge = Arrays.stream(dogs).collect(Collectors.partitioningBy(isYoung));
        System.out.println("Dogs partitioned by age: " + dogsByAge);

        // just filtering
        System.out.println("Only young dogs: " + Arrays.stream(dogs).filter(isYoung).collect(Collectors.toList()));

        // partitioning then grouping
        Map<Boolean, Map<Weight, List<Dog>>> dogsByKimNameAndOwner = Arrays.stream(dogs)
                .collect(Collectors.partitioningBy(isYoung, Collectors.groupingBy(dogWeight)));
        System.out.println("Dogs partitioned by age and weight: " + dogsByKimNameAndOwner);
    }
}
