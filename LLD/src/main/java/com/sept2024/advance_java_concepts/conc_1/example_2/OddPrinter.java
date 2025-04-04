package com.sept2024.advance_java_concepts.conc_1.example_2;

public class OddPrinter implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<=10;i++) {
            if(i%2==1) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}
