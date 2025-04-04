package com.sept2024.advance_java_concepts.conc_1.example_1;

public class BasicThread implements Runnable{
    @Override
    public void run() {
        System.out.println("I am in a new thread, " +
                "thread name: " +
                Thread.currentThread().getName());
    }
}
