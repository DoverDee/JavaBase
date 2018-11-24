package com.doverdee.designpattern.structural.flyweight;

public class FlyweightConcreteUnshared extends Flyweight {
  @Override
  public String getIntrinsic() {
    return "FlyweightConcreteUnshared";
  }

  @Override
  public void displayFlyweight(OutField outField) {
    System.out.println("FlyweightConcreteUnshared.displayFlyweight(OutField outField).");
  }
}
