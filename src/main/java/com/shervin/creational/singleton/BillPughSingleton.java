package com.shervin.creational.singleton;

/**
 * thread safe singleton class using Bill Pugh approach
 */
public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("BillPughSingleton instance created.");
    }

    // Static inner helper class
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public static method to get the instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
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
