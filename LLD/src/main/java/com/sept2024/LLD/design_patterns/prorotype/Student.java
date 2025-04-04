package com.sept2024.LLD.design_patterns.prorotype;

public class Student implements Prototype<Student>{

    private int age;
    public String name;
    public String University;

    public Student(int age, String name, String University) {
        this.age = age;
        this.name = name;
        this.University = University;
    }

    public Student(Student original) {
        this.age = original.age;
        this.name = original.name;
        this.University = original.University;
    }

    public Student clone() {
        return new Student(this);
    }
}
