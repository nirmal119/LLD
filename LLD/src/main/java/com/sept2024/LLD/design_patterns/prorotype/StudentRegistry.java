package com.sept2024.LLD.design_patterns.prorotype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private static StudentRegistry INSTANCE;
    private Map<String, Student> map;

    private StudentRegistry() {
        map = new HashMap<>();
    }

    public static StudentRegistry getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new StudentRegistry();
        }
        return INSTANCE;
    }


    public void register (String key, Student s) {
        map.put(key, s);
    }

    public Student get (String key) {
        return map.get(key);
    }

}
