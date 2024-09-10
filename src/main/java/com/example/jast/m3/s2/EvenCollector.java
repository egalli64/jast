/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.m3.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * A concrete collector for even values
 */
class EvenCollector implements Collector<Integer, List<Integer>, List<Integer>> {
    @Override
    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, x) -> {
            if (x % 2 == 0) {
                list.add(x);
            }
        };
    }

    @Override
    public BinaryOperator<List<Integer>> combiner() {
        return (left, right) -> {
            left.addAll(right);
            return left;
        };
    }

    @Override
    public Function<List<Integer>, List<Integer>> finisher() {
        throw new UnsupportedOperationException("IDENTITY_FINISH characteristic expected");
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED, Characteristics.CONCURRENT);
    }
}
