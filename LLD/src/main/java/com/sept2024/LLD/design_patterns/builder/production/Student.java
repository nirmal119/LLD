package com.sept2024.LLD.design_patterns.builder.production;

public class Student {

    // compulsory
    String name;
    String email;

    // optional
    int age;
    String university;
    int yearOfGraduation;

    private Student(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.university = builder.university;
        this.yearOfGraduation = builder.yearOfGraduation;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {

        // compulsory
        String name;
        String email;

        // optional
        int age;
        String university;
        int yearOfGraduation;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setYearOfGraduation(int yearOfGraduation) {
            this.yearOfGraduation = yearOfGraduation;
            return this;
        }

        public Student build() throws Exception {
            // validation here
            if(age<18){
                throw new Exception("Age must be at least 18");
            }
            if(name==null || email==null){
                throw new Exception("Name and email cannot be null");
            }

            // Call the constructor of Student and return the Student obj
            return new Student(this);
        }

    }
}
