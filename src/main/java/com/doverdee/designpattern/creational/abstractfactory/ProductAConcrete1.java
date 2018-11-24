package com.doverdee.designpattern.creational.abstractfactory;

public class ProductAConcrete1 implements ProductA {
  public ProductAConcrete1() {
    System.out.println("Construct Concrete1 of productA(A1).");
  }

  @Override
  public void methodDiff() {
    System.out.println("A1 execute methodDiff().");
  }
}
