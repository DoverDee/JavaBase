package com.doverdee.designpattern.behavioral.visitor;

public class Client{
  public static void main(String[] args){
    ElementStructure es = new ElementStructure();

    Element eca, ecb, ecc;
    eca = new ElementConcreteA();
    ecb = new ElementConcreteB();
    ecc = new ElementConcreteC();
    es.addElement(eca);
    es.addElement(ecb);
    es.addElement(ecc);

    Visitor vca, vcb;
    vca = new VisitorConcreteA();
    vcb = new VisitorConcreteB();

    System.out.println("访问者VisitorConcreteA对各种具体Element实现进行处理：");
    es.processedBy(vca);
    System.out.println("访问者VisitorConcreteB对各种具体Element实现进行处理：");
    es.processedBy(vcb);

  }
}
