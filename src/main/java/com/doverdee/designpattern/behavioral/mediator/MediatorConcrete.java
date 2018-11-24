package com.doverdee.designpattern.behavioral.mediator;

public class MediatorConcrete extends Mediator{
  private ColleagueConcreteA ca;
  private ColleagueConcreteB cb;
  private ColleagueConcreteC cc;

  public void setCa(ColleagueConcreteA ca){
    this.ca = ca;
  }

  public void setCb(ColleagueConcreteB cb){
    this.cb = cb;
  }

  public void setCc(ColleagueConcreteC cc){
    this.cc = cc;
  }

  /**
   * 封装同事对象之间的交互
   *
   * @param c
   */
  @Override
  public void ColleagueChanged(Colleague c){
    if(c == ca){
      System.out.println("具体中介者MediatorConcrete调用其他同事对象的操作有:");
      cb.doSomething();
      cc.update();
    }else if(c == cb){
      System.out.println("具体中介者MediatorConcrete调用其他同事对象的操作有:");
      ca.select();
      cc.doSomething();
    }else if(c == cc){
      System.out.println("具体中介者MediatorConcrete调用其他同事对象的操作有:");
      ca.add();
      cb.delete();
    }
  }
}
