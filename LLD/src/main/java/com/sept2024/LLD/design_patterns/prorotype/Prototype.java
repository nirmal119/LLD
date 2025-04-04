package com.sept2024.LLD.design_patterns.prorotype;

// Make Prototype interface generic
public interface Prototype<T> {
    T clone();
}
