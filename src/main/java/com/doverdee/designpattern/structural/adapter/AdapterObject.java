package com.doverdee.designpattern.structural.adapter;

public class AdapterObject implements Target {
  private Adapted adapted = new Adapted();
  @Override
  public void targetMethod() {
    System.out.println("AdapterObject.targetMethod()");
    adapted.specialMethod();
  }
}
