package com.doverdee.designpattern.structural.proxy;

public class Proxy extends Subject {
  RealSubject realSubject = new RealSubject();

  @Override
  public void requestMethod() {
    this.preMethod();
    realSubject.requestMethod();
    this.postMethod();
  }

  private void preMethod() {
    System.out.println("Proxy.preMethod()");
  }

  private void postMethod() {
    System.out.println("Proxy.postMethod()");
  }
}
