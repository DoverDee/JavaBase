package com.doverdee.designpattern.creational.abstractfactory;

public class ProductBConcrete1 implements ProductB {
  public ProductBConcrete1() {
    System.out.println("Construct Concrete1 of productB(B1).");
  }

  @Override
  public void methodDiff() {
    System.out.println("B1 execute methodDiff().");
  }
}
