package com.sept2024.advance_java_concepts.conc_2.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomnumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println("In callable, started generating random number");
        int n =  random.nextInt();
        Thread.sleep(1000 * 4);
        System.out.println("In callable, finished generating random number");
        return n;
    }
}
