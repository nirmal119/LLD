package com.sept2024.advance_java_concepts.conc_2.callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService es = Executors.newFixedThreadPool(2);

        RandomnumberGenerator rng = new RandomnumberGenerator();
        Future<Integer> fi =  es.submit(rng);
        System.out.println("Manager is doing his own task");
        int randomNumber = fi.get(5,TimeUnit.SECONDS);
        System.out.println("RN: " + randomNumber);

        es.shutdown();
    }
}
