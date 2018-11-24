package com.doverdee.designpattern.behavioral.visitor;

public class ElementConcreteB extends Element{
  @Override
  public void accept(Visitor visitor){
    visitor.visit(this);
  }
}
