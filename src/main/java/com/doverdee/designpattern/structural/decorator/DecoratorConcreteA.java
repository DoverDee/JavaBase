package com.doverdee.designpattern.structural.decorator;

public class DecoratorConcreteA extends Decorator {

  public DecoratorConcreteA(Component product) {
    super(product);
  }

  @Override
  public void execMethod() {
    this.decoratorMethodA();
    product.execMethod();
  }

  public void decoratorMethodA(){
    System.out.println("ProductDecoratorConcreteA.decoratorMethodA()");
  }
}
