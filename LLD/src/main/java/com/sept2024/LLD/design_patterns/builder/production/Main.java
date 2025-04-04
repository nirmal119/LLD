package com.sept2024.LLD.design_patterns.builder.production;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        1. Make the Builder a static inner class
        2. Hide the Builder class via a static method getBuilder
        3. In all the setter of Builder, return the Builder obj back
         */

        Student sb = Student.getBuilder()
                .setAge(19)
                .setName("Spider")
                .setEmail("spidy@mail.com")
                .setUniversity("IIT")
                .setYearOfGraduation(2021)
                .build();
    }
}
