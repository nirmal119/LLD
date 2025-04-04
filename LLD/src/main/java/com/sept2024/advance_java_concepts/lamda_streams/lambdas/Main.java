package com.sept2024.advance_java_concepts.lamda_streams.lambdas;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Runnable r = () -> {
                System.out.println("I am in a new thread");
                System.out.println("Hello World");
            };

        Runnable r1 = () -> System.out.println("I am in a new thread t1");

        Callable<Integer> cl = () -> {
            System.out.println("I am in a new thread c1");
            return 1;
        };

        Callable<Integer> cl1 = () -> 1;

        A a = (n) -> {
            n++;
            System.out.println("N:" + n);
        };

        Thread t = new Thread(r);
        t.start();
    }
}

interface A {
    void call(int n);
}
