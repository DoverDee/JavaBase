package com.doverdee.designpattern.structural.adapter;

public class ConcreteAdapter extends DefaultAbstractAdapter {
  @Override
  public void methodOne() {
    super.methodOne();
    System.out.println("Choose Override AbstractAdapter.methodOne();");
  }
}
