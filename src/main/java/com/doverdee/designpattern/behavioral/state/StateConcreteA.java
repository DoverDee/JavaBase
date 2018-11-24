package com.doverdee.designpattern.behavioral.state;

public class StateConcreteA extends State{
  @Override
  public void handle(){
    System.out.println("StateConcreteA.handle()");
  }

  @Override
  public void display(){
    System.out.println("StateConcreteA.display()");
  }
}
