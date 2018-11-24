package com.doverdee.designpattern.behavioral.observer;

public class ObserverConcreteA implements Observer{
  @Override
  public String getName(){
    return "ObserverConcreteA";
  }

  @Override
  public void update(){
    System.out.println("ObserverConcreteA.update();");
  }

  @Override
  public void feedback(Subject subject, String name){
    System.out.println("ObserverConcreteA.feedback()->" + name);
    subject.notifyOberver(name);
  }
}
