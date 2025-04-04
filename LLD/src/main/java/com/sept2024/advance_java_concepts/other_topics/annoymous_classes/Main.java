package com.sept2024.advance_java_concepts.other_topics.annoymous_classes;

public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
