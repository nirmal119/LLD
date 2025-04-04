package com.sept2024.LLD.design_patterns.prorotype;

public class SmartStudent extends Student {
    int iq;

    public SmartStudent(SmartStudent original) {
        super(original);
        this.iq = original.iq;
    }

    public SmartStudent(int age, String name, String university ,int iq) {
        super(age, name, university);
        this.iq = iq;
    }

    public SmartStudent clone() {
        return new SmartStudent(this);
    }

}
