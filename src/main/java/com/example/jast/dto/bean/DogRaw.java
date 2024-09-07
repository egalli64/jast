/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.dto.bean;

/**
 * A legacy non-comparable dog
 */
public class DogRaw {
    private String name;
    private String owner;

    public DogRaw() {
    }

    public DogRaw(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", owner=" + owner + "]";
    }
}
