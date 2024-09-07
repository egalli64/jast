/*
 * Introduction to Stream in Java
 * 
 * https://github.com/egalli64/jast
 */
package com.example.jast.dto.rec;

/**
 * A modern (JDK 14+) dog with extra info
 */
public record DogExt(String name, String owner, int age, double weight) {
}
