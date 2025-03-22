package com.shervin.creational.singleton;

/**
 * thread safe singleton class using static block initialization
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    static {
        INSTANCE = new StaticBlockSingleton();
    }

    //prevents of creating objects outside this class
    private StaticBlockSingleton() {
        System.out.println("StaticBlockSingleton instance created.");
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
