package com.sept2024.advance_java_concepts.other_topics.final_keyword;

public class Indian {
    final String name;
    final String aadharNumber;

    public Indian(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }

    public void print() {
        System.out.println(name + " " + aadharNumber);
    }
}
