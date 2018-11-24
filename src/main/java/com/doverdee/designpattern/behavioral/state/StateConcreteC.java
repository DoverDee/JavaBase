package com.doverdee.designpattern.behavioral.state;

public class StateConcreteC extends State{
  @Override
  public void handle(){
    System.out.println("StateConcreteC.handle()");
  }

  @Override
  public void display(){
    System.out.println("StateConcreteC.display()");
  }
}
