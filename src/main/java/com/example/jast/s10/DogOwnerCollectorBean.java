/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s10;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import com.example.jast.dto.DogBean;

/**
 * A concrete dog collector (using JavaBean)
 */
public class DogOwnerCollectorBean implements Collector<DogBean, Set<String>, Set<String>> {
    @Override
    public Supplier<Set<String>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<String>, DogBean> accumulator() {
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
        // actually, the finisher should not be invoked, given the IDENTITY_FINISH
        // characteristic
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED, Characteristics.CONCURRENT);
    }
}
