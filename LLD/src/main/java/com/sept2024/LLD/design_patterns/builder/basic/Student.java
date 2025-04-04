package com.sept2024.LLD.design_patterns.builder.basic;

public class Student {

    // compulsory
    String name;
    String email;

    // optional
    int age;
    String university;
    int yearOfGraduation;

    public Student(Builder builder) throws Exception{
        if(builder.age < 18) {
            throw new Exception("Age must be at least 18");
        }
        if(!(builder.name != null && builder.email != null)) {
            throw new Exception("Name and email are required");
        }

        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.university = builder.university;
        this.yearOfGraduation = builder.yearOfGraduation;
    }
}
