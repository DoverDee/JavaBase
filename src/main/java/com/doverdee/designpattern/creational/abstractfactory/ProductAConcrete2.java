package com.doverdee.designpattern.creational.abstractfactory;

public class ProductAConcrete2 implements ProductA {
  public ProductAConcrete2() {
    System.out.println("Construct Concrete2 of productA(A2).");
  }

  @Override
  public void methodDiff() {
    System.out.println("A2 execute methodDiff().");
  }
}
