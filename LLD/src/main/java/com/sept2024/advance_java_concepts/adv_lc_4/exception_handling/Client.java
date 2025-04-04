package com.sept2024.advance_java_concepts.adv_lc_4.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {
    public static void main(String[] args) {
//        readFile("sljbvksh");
        boolean b = checkAge("10");
        System.out.println("b= " + b);
    }

    public static boolean checkAge(String s) {
        try{
            int i=Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid Age");
        } finally {
            System.out.println("finally block");
//            return false;
        }

        System.out.println("compiler has reached here!");
        return false;
    }

    public static void readFile(String path) {
        try{
            FileReader fr = new FileReader(path);
            System.out.println("Reading file successful");
        }catch (FileNotFoundException e) {
            System.out.println("sorry: File not found");
        }finally {
            System.out.println("finally block: executes in all scenerios");
        }
    }
}
