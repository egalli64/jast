/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s13;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.jast.dto.DogExtBean;

/**
 * Grouping on user bean
 */
public class GroupingBean {
    private static final Function<DogExtBean, Weight> dogWeight = dog -> {
        double current = dog.getWeight();
        if (current < 3) {
            return Weight.LIGHT;
        } else if (current < 10) {
            return Weight.MEDIUM;
        } else {
            return Weight.HEAVY;
        }
    };

    private static final Predicate<DogExtBean> isYoung = dog -> dog.getAge() < 5;

    public static void main(String[] args) {
        List<DogExtBean> dogs = List.of( //
                new DogExtBean("Bob", "Tom Hanks", 7, 12.5), new DogExtBean("Tom", "Bob Marley", 5, 4.3), //
                new DogExtBean("Kim", "Wim Wenders", 4, 8.1), new DogExtBean("Kim", "Tom Hanks", 3, 2.5) //
        );
        System.out.println("Dogs: " + dogs);
        System.out.println("---");

        System.out.println("Grouping by owner");
        var groupedByOwner = dogs.stream().collect(Collectors.groupingBy(DogExtBean::getOwner));
        for (var entry : groupedByOwner.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        System.out.println("Grouping by weight (external function)");
        var groupedByWeight = dogs.stream().collect(Collectors.groupingBy(dogWeight));
        for (var entry : groupedByWeight.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        // filter then grouping
        System.out.println("Filtering the young ones then grouping by owner");
        Map<String, List<DogExtBean>> youngDogsByOwner = dogs.stream().filter(isYoung) //
                .collect(Collectors.groupingBy(DogExtBean::getOwner));
        for (var entry : youngDogsByOwner.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        // grouping then filtering
        System.out.println("Grouping by owner then filtering the young ones");
        Map<String, List<DogExtBean>> youngDogsByAllOwner = dogs.stream() //
                .collect(Collectors.groupingBy(DogExtBean::getOwner, Collectors.filtering(isYoung, Collectors.toList())));
        for (var entry : youngDogsByAllOwner.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---");

        // grouping and counting
        Map<String, Long> countDogsByOwner = dogs.stream()
                .collect(Collectors.groupingBy(DogExtBean::getOwner, Collectors.counting()));
        System.out.println("Counting dogs by owner: " + countDogsByOwner);
        System.out.println("---");

        // grouping then grouping
        Map<String, Map<Weight, List<DogExtBean>>> dogsByOwnerAndWeight = dogs.stream()
                .collect(Collectors.groupingBy(DogExtBean::getOwner, Collectors.groupingBy(dogWeight)));
        System.out.println("Dogs by owner and weight: " + dogsByOwnerAndWeight);

        // partitioning
        Map<Boolean, List<DogExtBean>> dogsByAge = dogs.stream().collect(Collectors.partitioningBy(isYoung));
        System.out.println("\nDogs partitioned by age: " + dogsByAge);

        // just filtering
        System.out.println("\nOnly young dogs: " + dogs.stream().filter(isYoung).collect(Collectors.toList()));

        // partitioning then grouping
        Map<Boolean, Map<Weight, List<DogExtBean>>> dogsByKimNameAndOwner = dogs.stream()
                .collect(Collectors.partitioningBy(isYoung, Collectors.groupingBy(dogWeight)));
        System.out.println("\nDogs partitioned by age and weight: " + dogsByKimNameAndOwner);
    }
}
