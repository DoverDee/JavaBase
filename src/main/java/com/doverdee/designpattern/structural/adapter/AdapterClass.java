package com.doverdee.designpattern.structural.adapter;

public class AdapterClass extends Adapted implements Target {

  @Override
  public void targetMethod() {
    System.out.println("AdapterClass.targetMethod()");
    specialMethod();
  }
}
