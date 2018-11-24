package com.doverdee.designpattern.behavioral.command;

import java.io.Serializable;

public class Handler implements Serializable {
  public void executeA() {
    System.out.println("Handler.executeA()");
  }

  public void executeB() {
    System.out.println("Handler.executeB()");
  }

  public void executeC() {
    System.out.println("Handler.executeC()");
  }

  public void executeD() {
    System.out.println("Handler.executeD()");
  }
}
