package com.doverdee.designpattern.structural.bridge;

public class InterfaceBridgeImpB implements InterfaceBridge {
  @Override
  public void interfaceDimensionMethod(Bridge bridge) {
    System.out.println("InterfaceBridgeImpB.interfaceDimensionMethod()");
  }
}
