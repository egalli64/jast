package com.example.jast.s06;

public record Dog(String name, String owner) implements Comparable<Dog> {
    @Override
    public int compareTo(Dog other) {
        if (this == other) {
            return 0;
        }
        int cmp = name.compareTo(other.name);
        if (cmp == 0) {
            return owner.compareTo(other.owner);
        }
        return cmp;
    }
}
