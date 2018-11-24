package com.doverdee.designpattern.creational.simplefactory;

public class ProductAConcrete implements Product {
  public ProductAConcrete() {
    System.out.println("Construct product A.");
  }

  @Override
  public void methodDiff() {
    System.out.println("A execute methodDiff().");
  }
}
