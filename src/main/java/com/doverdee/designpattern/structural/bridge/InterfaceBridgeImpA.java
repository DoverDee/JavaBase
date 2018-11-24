package com.doverdee.designpattern.structural.bridge;

public class InterfaceBridgeImpA implements InterfaceBridge {
  @Override
  public void interfaceDimensionMethod(Bridge bridge) {
    System.out.println("InterfaceBridgeImpA.interfaceDimensionMethod()");
  }
}
