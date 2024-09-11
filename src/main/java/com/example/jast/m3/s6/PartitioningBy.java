/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m3.s6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Using Collectors.partitioningBy
 */
public class PartitioningBy {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 0, 5, -23, 54, -11, 0, -11, 5, -23, 54);

        Map<Boolean, List<Integer>> partitionedBySign = values.stream() //
                .collect(Collectors.partitioningBy(x -> x >= 0));

        System.out.println("The partitioning: " + partitionedBySign);
        System.out.println("Positives are " + partitionedBySign.get(true));
    }
}
