package com.sept2024.LLD.design_patterns.singleton;

/**
 * Singleton Design Pattern
 *
 * The Singleton pattern ensures a class has only one instance and provides a global point
 * of access to that instance. It's useful when exactly one object is needed to coordinate
 * actions across the system.
 */
public class Singleton {
    // The single instance of Singleton - static and private
    private static Singleton instance;

    // Some example state of the singleton
    private String data;

    /**
     * Private constructor to prevent instantiation from outside
     * This is the key aspect of the Singleton pattern
     */
    private Singleton() {
        data = "Initial data";
        System.out.println("Singleton instance created");
    }

    /**
     * Static method to get the singleton instance
     * Uses lazy initialization (creates the instance only when first requested)
     */
    public static Singleton getInstance() {
        // Check if instance exists
        if (instance == null) {
            // Create new instance if it doesn't exist
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Thread-safe version of getInstance()
     * This implementation is more appropriate for multi-threaded applications
     */
    public static synchronized Singleton getThreadSafeInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Double-checked locking implementation
     * More efficient for thread safety as it only locks when necessary
     */
    public static Singleton getDoubleCheckedInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * Example method to demonstrate singleton functionality
     */
    public String getData() {
        return data;
    }

    /**
     * Example method to modify singleton state
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Example client code showing how to use a Singleton
     */
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("First instance data: " + singleton1.getData());

        // Modify the singleton's state
        singleton1.setData("New data value");

        // Get the singleton instance again (same instance)
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second instance data: " + singleton2.getData());

        // Verify it's the same instance
        System.out.println("Are they the same instance? " + (singleton1 == singleton2));
    }
}
