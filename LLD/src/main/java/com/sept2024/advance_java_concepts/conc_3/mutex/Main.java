package com.sept2024.advance_java_concepts.conc_3.mutex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        ExecutorService es = Executors.newFixedThreadPool(1);

        Count count = new Count();
        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        es.execute(adder);
        es.execute(subtractor);
        es.shutdown();

        try {
            // Wait until all tasks have completed execution after a shutdown request
            es.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        Thread T1 = new Thread(adder);
//        Thread T2 = new Thread(subtractor);
//        T1.start();
//        T2.start();
//
//        T1.join();
//        T2.join();

        System.out.println("Final value: " + count.num);
    }
}
