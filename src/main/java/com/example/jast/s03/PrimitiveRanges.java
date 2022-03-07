package com.example.jast.s03;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveRanges {
    public static void main(String[] args) {
        System.out.println("Right open range on primitive int stream [40..43)");
        IntStream.range(40, 43).forEach(System.out::println);

        System.out.println("Closed range on primitive long stream [40..43)");
        LongStream.rangeClosed(Long.MAX_VALUE - 2, Long.MAX_VALUE).forEach(System.out::println);
    }
}
