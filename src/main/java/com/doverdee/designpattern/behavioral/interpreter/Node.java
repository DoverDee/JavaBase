package com.doverdee.designpattern.behavioral.interpreter;

public abstract class Node{
  public abstract void interpret(Context text); //声明一个方法用于解释语句

  public abstract void execute(); //声明一个方法用于执行标记对应的命令
}
