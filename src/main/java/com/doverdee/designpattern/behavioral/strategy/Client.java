package com.doverdee.designpattern.behavioral.strategy;

public class Client{
  public static void main(String[] args){
    Context context = new Context();
    Strategy sa, sb, sc;
    sa = new StrategyConcreteA();
    sb = new StrategyConcreteB();
    sc = new StrategyConcreteC();

    context.algorithm();
    context.setStrategy(sa);
    context.algorithm();
    context.setStrategy(sc);
    context.algorithm();
    context.setStrategy(sb);
    context.algorithm();
  }
}
