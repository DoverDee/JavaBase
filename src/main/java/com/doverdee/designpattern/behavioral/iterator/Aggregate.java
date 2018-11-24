package com.doverdee.designpattern.behavioral.iterator;

import java.util.List;

public abstract class Aggregate{
  protected List<Object> objects;

  public Aggregate(List objects){
    this.objects = objects;
  }

  public void addObject(Object obj){
    this.objects.add(obj);
  }

  public void removeObject(Object obj){
    this.objects.remove(obj);
  }

  public List getObjects(){
    return this.objects;
  }

  /**
   * 声明创建迭代器对象的抽象工厂方法
   *
   * @return Iterator
   */
  public abstract Iterator createIterator();
}
