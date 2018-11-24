package com.doverdee.designpattern.creational.factorymethod;

public class ProductConcrete1 implements Product {
  public ProductConcrete1() {
    System.out.println("Construct Concrete1 of product(1).");
  }

  @Override
  public void methodDiff() {
    System.out.println("1 execute methodDiff().");
  }
}
