package com.sept2024.LLD.design_patterns.prorotype;

public class Main {
    public static void main(String[] args) {
        Student st = new Student(12, "Geek", "IIT");
        Student st1 = new SmartStudent(13, "Geek", "IIT", 100);
        Student copy = st.clone();
        Student copy2 = st1.clone();
        copy2.name = "forGeeks";
        System.out.println("qq");
    }
}
