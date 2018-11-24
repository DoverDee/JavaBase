package com.doverdee.designpattern.creational.singleton;

public class LazySingletonWithStatementSynchronizedTwoValidation {
  private LazySingletonWithStatementSynchronizedTwoValidation() {
  }

  private volatile static LazySingletonWithStatementSynchronizedTwoValidation instance;

  public LazySingletonWithStatementSynchronizedTwoValidation getInstance() {
    if (instance == null) {
      synchronized (LazySingletonWithStatementSynchronizedTwoValidation.class) {
        if (instance == null) {
          instance = new LazySingletonWithStatementSynchronizedTwoValidation();
        }
      }
    }
    return instance;
  }
}
