package com.sept2024.advance_java_concepts.conc_1.example_2;

public class Main {
    public static void main(String[] args) {
        OddPrinter op = new OddPrinter();
        EvenPrinter ep = new EvenPrinter();

        Thread oddThread = new Thread(op);
        Thread evenThread = new Thread(ep);

        oddThread.start();
        evenThread.start();
    }
}
