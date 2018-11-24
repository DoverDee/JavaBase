package com.doverdee.designpattern.structural.bridge;

public class AbstractBridgeExtB extends AbstractBridge {
  @Override
  public void abstractDimensionMethod(Bridge bridge) {
    interfaceBridge.interfaceDimensionMethod(bridge);
    System.out.println("AbstactBridgeExtB.abstractDimensionMethod()");
  }
}
