package com.doverdee.designpattern.structural.flyweight;

public class FlyweightConcreteB extends Flyweight {
  private final String intrinsic = "FlyweightConcreteB Intrinsic property Field.";

  @Override
  public String getIntrinsic() {
    return intrinsic;
  }

  @Override
  public void displayFlyweight(OutField outField) {
    System.out.println("FlyweightConcrete.method(OutField outField):" + getIntrinsic() + ";" + outField.getFieldOne() + "," + outField.getFieldTwo());
  }
}
