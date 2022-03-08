package com.example.jast.s09;

import java.util.List;

public class TwoCollects {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println("Working on: " + data + "\n---");

        Sum sum = data.stream().collect(Sum::new, Sum::accept, Sum::combine);
        System.out.print("Sum of all the elements, by collect(): ");
        System.out.println(sum.get() + "\n---");

        Average avg = data.stream().collect(Average::new, Average::accept, Average::combine);
        System.out.print("Average by collect(): ");
        System.out.println(avg.get() + "\n---");
    }
}

class Sum {
    private int result = 0;

    public int get() {
        return result;
    }

    public void accept(int cur) {
        result += cur;
    }

    public void combine(Sum other) {
        result += other.result;
    }
}

class Average {
    private int result = 0;
    private int count = 0;

    public double get() {
        return count == 0 ? 0 : result / (double) count;
    }

    public void accept(int cur) {
        result += cur;
        count += 1;
    }

    public void combine(Average other) {
        result += other.result;
        count += other.count;
    }
}
