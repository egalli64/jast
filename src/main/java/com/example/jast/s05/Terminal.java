package com.example.jast.s05;

import java.util.List;

public class Terminal {
    public static void main(String[] args) {
        List<Integer> values = List.of(11, 34, 2);

        System.out.println("Print each element in the stream - forEach()");
        values.stream().forEach(System.out::println);

        long count = values.stream().count();
        System.out.println("Count values in the stream - count(): " + count);
    }
}
