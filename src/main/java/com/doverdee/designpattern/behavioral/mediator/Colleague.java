package com.doverdee.designpattern.behavioral.mediator;

public abstract class Colleague{
  private Mediator mediator;

  public void setMediator(Mediator mediator){
    this.mediator = mediator;
  }

  /**
   * 转发调用
   */
  public void noteChanged(){
    mediator.ColleagueChanged(this);
  }

  public abstract void doSomething();
}
