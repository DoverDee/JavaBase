package com.doverdee.designpattern.creational.singleton;

public class LazySingletonWithMethodSynchronized {
    private LazySingletonWithMethodSynchronized() {
    }

    private static LazySingletonWithMethodSynchronized instance;

    public static synchronized LazySingletonWithMethodSynchronized getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithMethodSynchronized();
        }
        return instance;
    }
}
