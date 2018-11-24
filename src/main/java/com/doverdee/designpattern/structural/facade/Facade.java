package com.doverdee.designpattern.structural.facade;

public class Facade {
  private SubSystemA obj1 = new SubSystemA();
  private SubSystemB obj2 = new SubSystemB();
  private SubSystemC obj3 = new SubSystemC();

  public void Method() {
    System.out.println("Execute Method order that is determined by Facade.");
    obj1.MethodA();
    obj2.MethodB();
    obj3.MethodC();
  }
}
