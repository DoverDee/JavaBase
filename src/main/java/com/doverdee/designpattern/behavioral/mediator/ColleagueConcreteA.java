package com.doverdee.designpattern.behavioral.mediator;

public class ColleagueConcreteA extends Colleague{
  @Override
  public void doSomething(){
    System.out.println("ColleagueConcreteA.doSomething()");
  }

  public void add(){
    System.out.println("ColleagueConcreteA.add()");
  }

  public void select(){
    System.out.println("ColleagueConcreteA.select()");
  }
}
