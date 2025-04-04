package com.sept2024.LLD.design_patterns.builder.basic;

public class Main {
    public static void main(String[] args) throws Exception {
        Builder builder = new Builder();
        builder.setName("Spider Man");
        builder.setAge(18);
        builder.setEmail("sipdy@mail.com");
        builder.setUniversity("IIT");
        builder.setYearOfGraduation(2021);

        Student student = new Student(builder);

        System.out.println("Student obj is created, name: " + student.name);
    }
}
