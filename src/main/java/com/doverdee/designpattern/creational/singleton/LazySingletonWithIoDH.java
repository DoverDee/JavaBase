package com.doverdee.designpattern.creational.singleton;

public final class LazySingletonWithIoDH {
  private LazySingletonWithIoDH() {
  }

  private static class Holder {
    private static final LazySingletonWithIoDH instance = new LazySingletonWithIoDH();
  }

  public static LazySingletonWithIoDH getInstance() {
    return Holder.instance;
  }
}
