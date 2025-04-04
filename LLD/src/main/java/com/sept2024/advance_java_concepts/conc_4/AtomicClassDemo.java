package com.sept2024.advance_java_concepts.conc_4;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassDemo {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);
        int i = ai.getAndIncrement();

        AtomicBoolean ab = new AtomicBoolean(false);
        boolean b = ab.get();
    }
}
