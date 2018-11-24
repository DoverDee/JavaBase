package com.doverdee.designpattern.creational.abstractfactory;

public class FactoryConcrete1 implements Factory {
  @Override
  public ProductA getProductA() {
    return new ProductAConcrete1();
  }

  @Override
  public ProductB getProductB() {
    return new ProductBConcrete1();
  }
}
