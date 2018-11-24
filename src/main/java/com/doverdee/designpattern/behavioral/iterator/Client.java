package com.doverdee.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client{
  public static void main(String args[]){
    List objects = new ArrayList();
    objects.add("倚天剑");
    objects.add("屠龙刀");
    objects.add("断肠草");
    objects.add("葵花宝典");
    objects.add("四十二章经");

    Aggregate aggregate;
    Iterator iterator;

    aggregate = new AggregateConcrete(objects); //创建聚合对象
    iterator = aggregate.createIterator();   //创建迭代器对象

    System.out.println("正向遍历：");
    while(!iterator.isLast()){
      System.out.print(iterator.getNextItem() + "，");
      iterator.next();
    }
    System.out.println();
    System.out.println("-----------------------------");
    System.out.println("逆向遍历：");
    while(!iterator.isFirst()){
      System.out.print(iterator.getPreviousItem() + "，");
      iterator.previous();
    }
  }
}
