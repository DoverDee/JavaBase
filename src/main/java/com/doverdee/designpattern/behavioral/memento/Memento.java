package com.doverdee.designpattern.behavioral.memento;

public class Memento{
  private String state;
  private int x;
  private int y;

  public Memento(){
  }

  public Memento(Originator originator){
    this.state = originator.getState();
    this.x = originator.getX();
    this.y = originator.getY();
  }

  public String getState(){
    return state;
  }

  public void setState(String state){
    this.state = state;
  }

  public int getX(){
    return x;
  }

  public void setX(int x){
    this.x = x;
  }

  public int getY(){
    return y;
  }

  public void setY(int y){
    this.y = y;
  }
}
