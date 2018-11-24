package com.doverdee.designpattern.behavioral.mediator;

public class Client{
  public static void main(String[] args){
    //定义具体中介者对象
    MediatorConcrete mediator = new MediatorConcrete();

    //定义具体同事对象
    ColleagueConcreteA ca = new ColleagueConcreteA();
    ColleagueConcreteB cb = new ColleagueConcreteB();
    ColleagueConcreteC cc = new ColleagueConcreteC();

    //具体中介者持有相互需要通的同事的引用
    mediator.setCa(ca);
    mediator.setCb(cb);
    mediator.setCc(cc);

    //每个同事持有具体中介者
    ca.setMediator(mediator);
    cb.setMediator(mediator);
    cc.setMediator(mediator);

    System.out.println("-- ColleagueConcreteA触发事件通知具体中介者执行操作 --");
    ca.noteChanged();
    System.out.println("-- ColleagueConcreteC触发事件通C知具体中介者执行操作 --");
    cc.noteChanged();
  }
}
