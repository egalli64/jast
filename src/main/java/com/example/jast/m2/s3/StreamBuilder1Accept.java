/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m2.s3;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

/**
 * Stream generation by Stream.builder() with accept()
 */
public class StreamBuilder1Accept {
    public static void main(String[] args) {
        // the string stream builder object
        Builder<String> builder = Stream.builder();
        // the data to be put in the stream
        String[] data = { "one", "two", "three" };
        System.out.printf("The original data: %s\n\n", Arrays.toString(data));

        // each string in data is passed to the builder
        Arrays.stream(data).forEach(s -> builder.accept(s));

        // build the stream
        Stream<String> aStream = builder.build();

        System.out.println("Print each element in the stream:");
        aStream.forEach(System.out::println);
    }
}
