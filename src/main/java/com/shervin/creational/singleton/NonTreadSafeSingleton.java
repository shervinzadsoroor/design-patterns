package com.shervin.creational.singleton;

/**
 * for making the instance thread safe,
 * the getInstance method should be <b>synchronized</b>, but it has overhead
 * so the Bill Pugh or Static Block is recommended
 */
public class NonTreadSafeSingleton {

    private static NonTreadSafeSingleton INSTANCE;

    //prevents of creating objects outside this class
    private NonTreadSafeSingleton() {
        System.out.println("NonTreadSafeSingleton instance created.");
    }

    public static NonTreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NonTreadSafeSingleton();
        }
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
