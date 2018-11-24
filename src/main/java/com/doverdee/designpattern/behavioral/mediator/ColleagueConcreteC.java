package com.doverdee.designpattern.behavioral.mediator;

public class ColleagueConcreteC extends Colleague{
  @Override
  public void doSomething(){
    System.out.println("ColleagueConcreteC.doSomething()");
  }

  public void update(){
    System.out.println("ColleagueConcreteC.update()");
  }
}
