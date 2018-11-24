package com.doverdee.designpattern.structural.bridge;

public class AbstractBridgeExtA extends AbstractBridge {
  @Override
  public void abstractDimensionMethod(Bridge bridge) {
    interfaceBridge.interfaceDimensionMethod(bridge);
    System.out.println("AbstactBridgeExtA.abstractDimensionMethod()");
  }
}
