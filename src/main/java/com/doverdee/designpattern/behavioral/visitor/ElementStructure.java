package com.doverdee.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ElementStructure{
  private List<Element> el = new ArrayList<>();

  public ElementStructure(){
  }

  public ElementStructure(Element element){
    el.add(element);
  }

  public void addElement(Element element){
    el.add(element);
  }

  public void removeElement(Element element){
    el.remove(element);
  }

  public void processedBy(Visitor visitor){
    for(Element element : el){
      element.accept(visitor);
    }
  }

}
