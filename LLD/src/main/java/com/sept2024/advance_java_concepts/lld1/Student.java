package com.sept2024.advance_java_concepts.lld1;

public class Student {
    int age;
    float psp;
    String name;
    static String university;

    void changeBatch() {
        System.out.println(name + " is changing batch");
    }

    void pauseCourse() {
        System.out.println(name + " is pausing course");
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PSP: " + psp);
    }
}
