package com.example.jast.s04;

import java.util.Arrays;

public class SimpleTerminalPrimitive {
    public static void main(String[] args) {
        int[] values = { 11, 34, 2 };

        System.out.println("Print each element in the int stream - forEach()");
        Arrays.stream(values).forEach(System.out::println);

        long count = Arrays.stream(values).count();
        System.out.println("Count values in the int stream - count(): " + count);
    }
}
