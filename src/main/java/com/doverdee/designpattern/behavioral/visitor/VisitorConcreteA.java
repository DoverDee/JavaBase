package com.doverdee.designpattern.behavioral.visitor;

public class VisitorConcreteA implements Visitor{
  @Override
  public void visit(ElementConcreteA eca){
    System.out.println("VisitorConcreteA.visit(ElementConcreteA eca)");
  }

  @Override
  public void visit(ElementConcreteB ecb){
    System.out.println("VisitorConcreteA.visit(ElementConcreteB ecb)");
  }

  @Override
  public void visit(ElementConcreteC ecc){
    System.out.println("VisitorConcreteA.visit(ElementConcreteC ecc)");
  }
}
