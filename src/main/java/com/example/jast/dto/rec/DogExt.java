/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.dto.rec;

/**
 * A modern dog with extra info
 */
public record DogExt(Dog dog, int age, double weight) {
    /**
     * Create the basic dog and inject it in the new record
     * 
     * @param name   dog name
     * @param owner  dog owner
     * @param age    dog age
     * @param weight dog weight
     */
    public DogExt(String name, String owner, int age, double weight) {
        this(new Dog(name, owner), age, weight);
    }
}
