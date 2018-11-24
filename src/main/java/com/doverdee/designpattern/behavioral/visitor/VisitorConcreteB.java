package com.doverdee.designpattern.behavioral.visitor;

public class VisitorConcreteB implements Visitor{
  @Override
  public void visit(ElementConcreteA eca){
    System.out.println("VisitorConcreteB.visit(ElementConcreteA eca)");
  }

  @Override
  public void visit(ElementConcreteB ecb){
    System.out.println("VisitorConcreteB.visit(ElementConcreteB ecb)");
  }

  @Override
  public void visit(ElementConcreteC ecc){
    System.out.println("VisitorConcreteB.visit(ElementConcreteC ecc)");
  }
}
