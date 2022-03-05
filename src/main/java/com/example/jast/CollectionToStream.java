package com.example.jast;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStream {
    public static void main(String[] args) {
        Collection<String> data = List.of("first", "second", "third");
        System.out.println("Collection -> Stream -> operate on it");
        Stream<String> stream = data.stream();
        stream.forEach(System.out::println);
    }
}
