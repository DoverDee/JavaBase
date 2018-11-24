package com.doverdee.designpattern.structural.adapter;

public class Client {
  public static void main(String[] args) {
    //Object adapter
    AdapterObject adapterObject = new AdapterObject();
    adapterObject.targetMethod();

    //Class adapter
    AdapterClass adapterClass = new AdapterClass();
    adapterClass.targetMethod();

    ConcreteAdapter concreteAdapter = new ConcreteAdapter();
    concreteAdapter.methodOne();
  }
}
