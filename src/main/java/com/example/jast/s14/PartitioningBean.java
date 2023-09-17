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

import com.example.jast.dto.DogExtBean;
import com.example.jast.dto.Weight;

/**
 * Partitioning examples on user JavaBaean
 */
public class PartitioningBean {
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
        DogExtBean[] dogs = { //
                new DogExtBean("Bob", "Tom Hanks", 7, 12.5), //
                new DogExtBean("Tom", "Bob Marley", 5, 4.3), //
                new DogExtBean("Kim", "Wim Wenders", 4, 8.1), //
                new DogExtBean("Kim", "Tom Hanks", 3, 2.5) //
        };
        System.out.println("Dogs: " + Arrays.toString(dogs));

        // partitioning
        Map<Boolean, List<DogExtBean>> dogsByAge = Arrays.stream(dogs).collect(Collectors.partitioningBy(isYoung));
        System.out.println("Dogs partitioned by age: " + dogsByAge);

        // just filtering
        System.out.println("Only young dogs: " + Arrays.stream(dogs).filter(isYoung).collect(Collectors.toList()));

        // partitioning then grouping
        Map<Boolean, Map<Weight, List<DogExtBean>>> dogsByKimNameAndOwner = Arrays.stream(dogs)
                .collect(Collectors.partitioningBy(isYoung, Collectors.groupingBy(dogWeight)));
        System.out.println("Dogs partitioned by age and weight: " + dogsByKimNameAndOwner);
    }
}
