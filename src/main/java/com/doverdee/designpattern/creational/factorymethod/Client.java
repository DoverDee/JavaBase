package com.doverdee.designpattern.creational.factorymethod;

public class Client {
  public static void main(String[] args) {
    //factory can be construct by reflection.
    //Factory factory = (Factory)XMLUtil.getBean();
    Factory factory = new FactoryConcrete2();
    Product product = factory.getProduct();
    product.methodDiff();
  }
}
