/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m3.s2.bean;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import com.example.jast.dto.bean.Dog;

/**
 * A concrete dog (JavaBean) collector for the dog owners
 */
public class DogOwnerCollector implements Collector<Dog, Set<String>, Set<String>> {
    @Override
    public Supplier<Set<String>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<String>, Dog> accumulator() {
        return (list, dog) -> list.add(dog.getOwner());
    }

    @Override
    public BinaryOperator<Set<String>> combiner() {
        return (left, right) -> {
            left.addAll(right);
            return left;
        };
    }

    @Override
    public Function<Set<String>, Set<String>> finisher() {
        throw new UnsupportedOperationException("IDENTITY_FINISH characteristic expected");
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED, Characteristics.CONCURRENT);
    }
}
