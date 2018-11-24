package com.doverdee.designpattern.behavioral.iterator;

import java.util.List;

public class IteratorConcrete implements Iterator{
  /**
   * 维持一个对具体聚合对象的引用，以便于访问存储在聚合对象中的数据
   */
  private AggregateConcrete aggregateConcrete;
  private List objects;
  /**
   * 定义一个游标，用于记录正向遍历的位置
   */
  private int nextCursor;
  /**
   * 定义一个游标，用于记录逆向遍历的位置
   */
  private int previousCursor;

  public IteratorConcrete(AggregateConcrete aggregateConcrete){
    this.aggregateConcrete = aggregateConcrete;
    this.objects = aggregateConcrete.getObjects(); //获取集合对象
    nextCursor = 0; //设置正向遍历游标的初始值
    previousCursor = objects.size() - 1; //设置逆向遍历游标的初始值
  }

  @Override
  public void first(){
    nextCursor = 0;
  }

  @Override
  public void last(){
    previousCursor = objects.size() - 1;
  }

  @Override
  public boolean isFirst(){
    return (previousCursor == -1);
  }

  @Override
  public boolean isLast(){
    return (nextCursor == objects.size());
  }

  @Override
  public void next(){
    if(nextCursor < objects.size()){
      nextCursor++;
    }
  }

  @Override
  public void previous(){
    if(previousCursor > -1){
      previousCursor--;
    }
  }

  @Override
  public Object getNextItem(){
    return objects.get(nextCursor);
  }

  @Override
  public Object getPreviousItem(){
    return objects.get(previousCursor);
  }
}
