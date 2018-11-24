package com.doverdee.designpattern.behavioral.visitor;

public class ElementConcreteA extends Element{
  @Override
  public void accept(Visitor visitor){
    visitor.visit(this);
  }
}
