/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s09;

/**
 * Helper for collect terminal operation
 */
class CollectAverage {
    private int result = 0;
    private int count = 0;

    public double get() {
        return count == 0 ? 0 : result / (double) count;
    }

    public void accept(int cur) {
        result += cur;
        count += 1;
    }

    public void combine(CollectAverage other) {
        result += other.result;
        count += other.count;
    }
}
