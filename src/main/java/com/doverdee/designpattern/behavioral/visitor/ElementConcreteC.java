package com.doverdee.designpattern.behavioral.visitor;

public class ElementConcreteC extends Element{
  @Override
  public void accept(Visitor visitor){
    visitor.visit(this);
  }
}
