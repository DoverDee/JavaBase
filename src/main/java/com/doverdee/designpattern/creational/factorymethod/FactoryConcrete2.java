package com.doverdee.designpattern.creational.factorymethod;

public class FactoryConcrete2 implements Factory {
  @Override
  public Product getProduct() {
    return new ProductConcrete2();
  }
}
