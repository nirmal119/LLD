package com.sept2024.advance_java_concepts.adv_lc_4.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Starting to read the file");
        readFile("sdffr");
        System.out.println("FileReader object is ready");
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileReader fr = new FileReader("werper");
    }
}
