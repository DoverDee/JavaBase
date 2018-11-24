package com.doverdee.designpattern.behavioral.observer;

public class Client{
  public static void main(String[] args){
    SubjectConrete sc = new SubjectConrete();

    //定义三个观察者对象
    Observer oa, ob, oc;
    oa = new ObserverConcreteA();
    ob = new ObserverConcreteB();
    oc = new ObserverConcreteC();

    sc.attachObserver(oa);
    sc.attachObserver(ob);
    sc.attachObserver(oc);

    System.out.println("目标对象（因某种原因）主动发送通知:");
    sc.notifyOberver("Concrete subject notify observers.");

    System.out.println("某个观察者（oa）发出反馈消息，反馈消息被转发到其他观察者：");
    oa.feedback(sc, oa.getName());
  }
}
