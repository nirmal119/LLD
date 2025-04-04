package com.sept2024.advance_java_concepts.lld1;

public class StaticKeyword {
    public static void main(String[] args) {
        Student student = new Student();
        Student.university = "University";
//        student.university = "IIIT-H";

        System.out.println(Student.university);
    }
}
