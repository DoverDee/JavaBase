package com.doverdee.designpattern.structural.composite;

public class CompositeWithNoComponentA extends Component {
  private String name;

  public CompositeWithNoComponentA(String name) {
    this.name = name;
  }

  @Override
  public void addComponent(Component component) {
    throw new RuntimeException("This method is not supported");
  }

  @Override
  public void removeComponent(Component component) {
    throw new RuntimeException("This method is not supported");
  }

  @Override
  public Component getChild(int i) {
    throw new RuntimeException("This method is not supported");
  }

  @Override
  public void operationMethod() {
    System.out.println("CompositeWithNoComponentA.operationMethod("+name+")");
  }
}
