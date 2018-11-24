package com.doverdee.designpattern.behavioral.memento;

public class Originator{
  private String state;
  private int x;
  private int y;

  public Originator(){
  }

  public Originator(String state, int x, int y){
    this.state = state;
    this.x = x;
    this.y = y;
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

  public Memento crteateMemento(){
    return new Memento(this);
  }

  public void restore(Memento memento){
    this.state = memento.getState();
    this.x = memento.getX();
    this.y = memento.getY();
  }
}
