/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.dto.bean;

/**
 * Legacy (before JDK 14) comparable dog with extra info
 */
public class DogExt extends com.example.jast.dto.bean.Dog {
    private int age;
    private double weight;

    public DogExt() {
    }

    public DogExt(String name, String owner, int age, double weight) {
        super(name, owner);
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "DogExtBean [name=" + getName() + ", owner=" + getOwner() + "age=" + age + ", weight=" + weight + "]";
    }
}
