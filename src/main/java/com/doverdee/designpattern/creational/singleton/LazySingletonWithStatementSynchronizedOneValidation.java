package com.doverdee.designpattern.creational.singleton;

public class LazySingletonWithStatementSynchronizedOneValidation {
  private LazySingletonWithStatementSynchronizedOneValidation() {
  }

  private static LazySingletonWithStatementSynchronizedOneValidation instance;

  public static LazySingletonWithStatementSynchronizedOneValidation getInstance() {
    if (instance == null) {
      synchronized (LazySingletonWithStatementSynchronizedOneValidation.class) {
        instance = new LazySingletonWithStatementSynchronizedOneValidation();
      }
    }
    return instance;
  }
}
