package com.sept2024.advance_java_concepts.conc_3.synchronized_method;

public class Count {
    int num;

    public synchronized void incrementValue() { this.num++; }

    public synchronized void decrementValue() { this.num--; }
}
