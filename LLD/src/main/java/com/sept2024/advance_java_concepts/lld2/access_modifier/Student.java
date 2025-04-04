package com.sept2024.advance_java_concepts.lld2.access_modifier;

public class Student {
    private int age;
    public String name;
    protected String email;
    String university;

    void printAge() {
        System.out.println(age);
    }

    private void printName() {
        System.out.println(name);
    }
}
