package com.doverdee.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{
  protected List<Observer> ol = new ArrayList<>();

  public void attachObserver(Observer observer){
    System.out.println("加入观察者：" + observer.getName());
    ol.add(observer);
  }

  public void detachObserver(Observer observer){
    System.out.println("移除观察者：" + observer.getName());
    ol.remove(observer);
  }

  public abstract String getName();

  public abstract void notifyOberver(String name);
}
