package com.doverdee.designpattern.behavioral.mediator;

public class ColleagueConcreteB extends Colleague{
  @Override
  public void doSomething(){
    System.out.println("ColleagueConcreteB.doSomething()");
  }

  public void delete(){
    System.out.println("ColleagueConcreteB.delete()");
  }
}
