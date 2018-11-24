package com.doverdee.designpattern.creational.factorymethod;

public class FactoryConcrete1 implements Factory {
  @Override
  public Product getProduct() {
    return new ProductConcrete1();
  }
}
