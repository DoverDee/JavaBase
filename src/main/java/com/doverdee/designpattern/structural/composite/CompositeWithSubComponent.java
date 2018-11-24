package com.doverdee.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeWithSubComponent extends Component {
  private String name;

  private List<Component> componentList = new ArrayList<Component>();

  public CompositeWithSubComponent(String name) {
    this.name = name;
  }

  @Override
  public void addComponent(Component component) {
    componentList.add(component);
  }

  @Override
  public void removeComponent(Component component) {
    componentList.remove(component);
  }

  @Override
  public Component getChild(int i) {
    return componentList.get(i);
  }

  @Override
  public void operationMethod() {
    for (Component component : componentList) {
      component.operationMethod();
    }
  }
}
