package com.doverdee.designpattern.structural.decorator;

public class DecoratorConcreteB extends Decorator {

  public DecoratorConcreteB(Component product) {
    super(product);
  }

  @Override
  public void execMethod() {
    this.decoratorMethodB();
    product.execMethod();
  }

  public void decoratorMethodB(){
    System.out.println("ProductDecoratorConcreteB.decoratorMethodB()");
  }
}
