package com.sept2024.advance_java_concepts.lamda_streams.streams;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(234,356,231,456,986809,546,34,23,1,12);

        /*

        HashSet<Integer> hs = new HashSet<>(ls);
        ls = new ArrayList<>(hs);

        List<Integer> ms = new ArrayList<>();
        for(int i=0; i< ls.size(); i++) {
            int num = ls.get(i);
            if(ls.get(i) % 2 == 0) {
                ms.add(num*num);
            }
        }

        Collections.sort(ms);

        for(int e: ms) {
            System.out.println(e);
        }

        */

        ls.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
