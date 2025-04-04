package com.sept2024.advance_java_concepts.conc_1.example_2;

public class EvenPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++) {
            if(i%2==0) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}
