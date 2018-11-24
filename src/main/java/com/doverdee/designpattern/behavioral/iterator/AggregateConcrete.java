package com.doverdee.designpattern.behavioral.iterator;

import java.util.List;

public class AggregateConcrete extends Aggregate{

  public AggregateConcrete(List objects){
    super(objects);
  }

  @Override
  public Iterator createIterator(){
    return new IteratorConcrete(this);
  }
}
