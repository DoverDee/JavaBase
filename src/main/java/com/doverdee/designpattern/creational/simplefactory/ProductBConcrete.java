package com.doverdee.designpattern.creational.simplefactory;

public class ProductBConcrete implements Product {
  public ProductBConcrete() {
    System.out.println("Construct product B.");
  }

  @Override
  public void methodDiff() {
    System.out.println("B execute methodDiff().");
  }
}
