package com.doverdee.designpattern.structural.bridge;

public abstract class AbstractBridge {
  protected InterfaceBridge interfaceBridge;

  public void setInterfaceBridge(InterfaceBridge interfaceBridge){
    this.interfaceBridge = interfaceBridge;
  }

  public abstract void abstractDimensionMethod(Bridge bridge);
}
