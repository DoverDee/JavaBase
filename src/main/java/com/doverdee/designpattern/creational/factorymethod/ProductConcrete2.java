package com.doverdee.designpattern.creational.factorymethod;

public class ProductConcrete2 implements Product {
  public ProductConcrete2() {
    System.out.println("Construct Concrete2 of product(2).");
  }

  @Override
  public void methodDiff() {
    System.out.println("2 execute methodDiff().");
  }
}
