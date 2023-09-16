/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.dto;

import java.util.Objects;

/**
 * Legacy (before JDK 14) comparable dog, name first, then owner
 */
public class DogBean implements Comparable<DogBean> {
    private String name;
    private String owner;

    public DogBean() {
    }

    public DogBean(String name, String owner) {
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
    public int compareTo(DogBean other) {
        if (this == other) {
            return 0;
        }
        int cmp = name.compareTo(other.name);
        if (cmp == 0) {
            return owner.compareTo(other.owner);
        }
        return cmp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DogBean other = (DogBean) obj;
        return Objects.equals(name, other.name) && Objects.equals(owner, other.owner);
    }

    @Override
    public String toString() {
        return "DogBean [name=" + name + ", owner=" + owner + "]";
    }
}
