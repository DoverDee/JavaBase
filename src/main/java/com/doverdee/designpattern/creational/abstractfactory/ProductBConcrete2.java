package com.doverdee.designpattern.creational.abstractfactory;

public class ProductBConcrete2 implements ProductB {
  public ProductBConcrete2() {
    System.out.println("Construct Concrete2 of productB(B2).");
  }

  @Override
  public void methodDiff() {
    System.out.println("B2 execute methodDiff().");
  }
}
