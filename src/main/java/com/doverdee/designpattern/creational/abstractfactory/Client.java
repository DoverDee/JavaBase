package com.doverdee.designpattern.creational.abstractfactory;

public class Client {
  public static void main(String[] args) {
    //factory can be construct by reflection.
    //Factory factory = (Factory)XMLUtil.getBean();
    Factory factory = new FactoryConcrete2();
    ProductA productA = factory.getProductA();
    productA.methodDiff();
    ProductB productB = factory.getProductB();
    productB.methodDiff();
    //...factory can get other product
  }
}
