package com.doverdee.designpattern.structural.composite;

public abstract class Component {
  public abstract void addComponent(Component component);
  public abstract void removeComponent(Component component);
  public abstract Component getChild(int i);
  public abstract void operationMethod();
}
