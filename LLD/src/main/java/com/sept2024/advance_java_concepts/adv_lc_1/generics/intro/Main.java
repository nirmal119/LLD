package com.sept2024.advance_java_concepts.adv_lc_1.generics.intro;

public class Main {
    public static void main(String[] args) {
//        ObjectPrinter objectPrinter = new ObjectPrinter("Hello");
//        String s = (String) objectPrinter.get();
//        System.out.println(s);

        Printer<Integer> pi = new Printer<>(5);
        pi.print();

        Printer<String> ps = new Printer<>("Hello");
        ps.print();

        Pair<String, Integer> pair = new Pair<>("Hello!", 7);

        print(5);
        print("Hello!");
        print(pair);

    }

    public static <T> void print(T someThing) {
        System.out.println(someThing);
    }
}
