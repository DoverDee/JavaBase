package com.doverdee.designpattern.behavioral.state;

public class StateConcreteB extends State{
  @Override
  public void handle(){
    System.out.println("StateConcreteB.handle()");
  }

  @Override
  public void display(){
    System.out.println("StateConcreteB.display()");
  }
}
