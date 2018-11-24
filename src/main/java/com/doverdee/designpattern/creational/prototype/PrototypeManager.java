package com.doverdee.designpattern.creational.prototype;

import java.util.concurrent.ConcurrentHashMap;

public class PrototypeManager {
  private ConcurrentHashMap<String, Prototype> ht = new ConcurrentHashMap<String, Prototype>();
  private static PrototypeManager instance = new PrototypeManager();

  public static PrototypeManager getInstance() {
    return instance;
  }

  public void addPrototypeConcrete(String prototypeKey, Prototype prototype) {
    ht.put(prototypeKey, prototype);
  }

  public Prototype getPrototypeConcreteClone(String prototypeKey) {
    return ht.get(prototypeKey).clone();
  }
}
