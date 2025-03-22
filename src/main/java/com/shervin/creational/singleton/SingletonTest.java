package com.shervin.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    public void test_billPullClass_is_singleton() {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }

    @Test
    public void test_nonThreadSafeClass_is_singleton() {
        NonTreadSafeSingleton instance1 = NonTreadSafeSingleton.getInstance();
        NonTreadSafeSingleton instance2 = NonTreadSafeSingleton.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }

    @Test
    public void test_staticBlockClass_is_singleton() {
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }

}