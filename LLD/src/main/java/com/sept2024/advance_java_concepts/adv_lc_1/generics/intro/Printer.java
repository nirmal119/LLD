package com.sept2024.advance_java_concepts.adv_lc_1.generics.intro;

public class Printer <T>{

    T thingsToPrint;
    public Printer(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }
}
