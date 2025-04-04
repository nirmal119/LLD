package com.sept2024.advance_java_concepts.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Starting to read the file");
//        FileReader fr = new FileReader("werwer");
//        System.out.println("FileReader object is ready");

        int x = numbers("12");
        System.out.println("x= " + x);

        String ss = "jsdvb";
        System.out.println(ss.length());
    }

    public static int numbers(String num) {
        try {
            System.out.println("In try block");

//            FileReader fr = new FileReader("werwer");
            int n = Integer.parseInt(num);
            System.out.println("after fr");
            return 2;
        } catch (NumberFormatException e){
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block");
            return 9;
        }
    }
}
