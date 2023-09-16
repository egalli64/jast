/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.s05;

/**
 * A comparable DTO: compare name first, then owner
 */
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
