package com.doverdee.designpattern.structural.bridge;

public class Client {
  public static void main(String[] args) {
    Bridge bridge = new Bridge();
    InterfaceBridge interfaceBridge = new InterfaceBridgeImpA();
    AbstractBridge abstractBridge = new AbstractBridgeExtA();
    abstractBridge.setInterfaceBridge(interfaceBridge);
    abstractBridge.abstractDimensionMethod(bridge);
  }
}
