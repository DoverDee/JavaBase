//: innerclasses/controller/Event.java
// The common methods for any control event.
package com.doverdee.thinkinginjava.innerclasses.controller;

public abstract class Event {
  private long eventTime;
  protected final long delayTime;
  public Event(long delayTime) {
    this.delayTime = delayTime;
    start();
  }
  public void start() { // Allows restarting
    eventTime = System.nanoTime() + delayTime;
  }
  public boolean ready() {
    return System.nanoTime() >= eventTime;
  }
  public abstract void action();

  public static void main(String[] args) {
    long s = System.nanoTime();
    for (int i=0;i<10;i++){
      System.out.println(i);
    }
    long e = System.nanoTime();
    System.out.println(e-s);
  }
} ///:~
