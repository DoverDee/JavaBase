package com.doverdee.designpattern.behavioral.observer;

public class ObserverConcreteB implements Observer{
  @Override
  public String getName(){
    return "ObserverConcreteB";
  }

  @Override
  public void update(){
    System.out.println("ObserverConcreteB.update();");
  }

  @Override
  public void feedback(Subject subject, String name){
    System.out.println("ObserverConcreteB.feedback()->" + name);
    subject.notifyOberver(name);
  }
}
