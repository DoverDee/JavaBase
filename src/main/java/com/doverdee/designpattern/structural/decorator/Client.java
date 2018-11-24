package com.doverdee.designpattern.structural.decorator;

public class Client {
  public static void main(String[] args) {
    //Product cpa, pdca, pdcb;
    ConcreteComponentA cpa = new ConcreteComponentA();
    DecoratorConcreteA pdca = new DecoratorConcreteA(cpa);
    DecoratorConcreteB pdcb = new DecoratorConcreteB(pdca);
    pdcb.execMethod();
  }
}
