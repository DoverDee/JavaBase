package com.doverdee.designpattern.creational.abstractfactory;

public class FactoryConcrete2 implements Factory {
  @Override
  public ProductA getProductA() {
    return new ProductAConcrete2();
  }

  @Override
  public ProductB getProductB() {
    return new ProductBConcrete2();
  }
}
