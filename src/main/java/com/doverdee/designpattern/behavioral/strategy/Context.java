package com.doverdee.designpattern.behavioral.strategy;

public class Context{
  private Strategy strategy;

  public void setStrategy(Strategy strategy){
    this.strategy = strategy;
  }

  public Context(){
    //设置默认策略算法
    this.strategy = new StrategyConcrete();
  }

  public Context(Strategy strategy){
    this.strategy = strategy;
  }

  public void algorithm(){
    this.strategy.algorithm();
  }
}
