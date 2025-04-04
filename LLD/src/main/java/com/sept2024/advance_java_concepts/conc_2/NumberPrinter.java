package com.sept2024.advance_java_concepts.conc_2;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting a new thread");
        for(int i=1;i<=10  ;i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
