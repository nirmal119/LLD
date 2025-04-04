package com.sept2024.advance_java_concepts.adv_lc_1.generics.intro;

public class Pair <T,V>{
    T key;
    V value;

    public Pair (T key, V value) {
        this.key = key;
        this.value = value;
    }
}
