package com.sept2024.advance_java_concepts.lld2.constructors;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.age);

        Animal b = new Animal("Cat");
        System.out.println(b.name);
    }
}
