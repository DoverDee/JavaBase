package com.doverdee.designpattern.behavioral.observer;

public class SubjectConrete extends Subject{
  @Override
  public String getName(){
    return "SubjectConrete";
  }

  @Override
  public void notifyOberver(String name){
    System.out.println("SubjectConrete.notifyOberver()->" + name);
    for(Observer observer : ol){
      if(!name.equals(observer.getName())){
        observer.update();
      }
    }
  }
}
