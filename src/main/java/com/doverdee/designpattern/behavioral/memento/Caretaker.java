package com.doverdee.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker{
  private List<Memento> ml = new ArrayList();

  public Caretaker(){
  }

  public Memento getMemento(int i){
    return (Memento) ml.get(i);
  }

  public void setMemento(Memento memento, int i){
    ml.add(i, memento);
  }
}
