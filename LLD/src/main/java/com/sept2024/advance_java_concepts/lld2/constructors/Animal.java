package com.sept2024.advance_java_concepts.lld2.constructors;

public class Animal {

    public String name;
    public int age;
    private String breed;

    public Animal() {
        name = "Dog";
        age = 1;
        breed = "Pub";
    }

    public Animal(String name) {
        this.name = name;
    }
}
