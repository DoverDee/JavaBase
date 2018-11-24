package com.doverdee.designpattern.creational.singleton;

public class LazySingleton {
  private LazySingleton() {
  }

  private static LazySingleton instance;

  public static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }
}
