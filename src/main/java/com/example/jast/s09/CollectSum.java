/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s09;

/**
 * Helper for collect terminal operation
 */
class CollectSum {
    private int result = 0;

    public int get() {
        return result;
    }

    public void accept(int cur) {
        result += cur;
    }

    public void combine(CollectSum other) {
        result += other.result;
    }
}
