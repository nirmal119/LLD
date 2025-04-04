package com.sept2024.advance_java_concepts.abstract_class;

public abstract class Animal {

    String name;

    void printName() {
        System.out.println(name);
    }

    abstract void walk();
}

abstract class Dog extends Animal {
    String breed;
}

class Pub extends Dog {

    @Override
    void walk() {
        System.out.println("Pub is walking");
    }
}
