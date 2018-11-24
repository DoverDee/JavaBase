package com.doverdee.designpattern.behavioral.visitor;

public interface Visitor{
  void visit(ElementConcreteA eca);

  void visit(ElementConcreteB ecb);

  void visit(ElementConcreteC ecc);
}
