package com.doverdee.designpattern.behavioral.observer;

public class ObserverConcreteC implements Observer{
  @Override
  public String getName(){
    return "ObserverConcreteC";
  }
  @Override
  public void update(){
    System.out.println("ObserverConcreteC.update();");
  }

  @Override
  public void feedback(Subject subject, String name){
    System.out.println("ObserverConcreteC.feedback()->" + name);
    subject.notifyOberver(name);
  }
}
