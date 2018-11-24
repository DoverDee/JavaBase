package com.doverdee.designpattern.behavioral.chainofresponsibility;

public class HandlerConcreteDefault extends Handler {
  public HandlerConcreteDefault(String name) {
    super(name);
  }

  @Override
  public void handleRequest(String request) {
    System.out.println(this.name + ".handleRequest(String request)");
  }
}
