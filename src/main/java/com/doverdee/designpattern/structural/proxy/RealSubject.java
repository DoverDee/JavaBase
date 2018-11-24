package com.doverdee.designpattern.structural.proxy;

public class RealSubject extends Subject {
  @Override
  public void requestMethod() {
    System.out.println("RealSubject.requestMethod()");
  }
}
