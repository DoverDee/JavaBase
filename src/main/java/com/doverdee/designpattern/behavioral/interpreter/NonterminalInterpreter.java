package com.doverdee.designpattern.behavioral.interpreter;

public class NonterminalInterpreter extends Interpreter{
  private Interpreter left;
  private Interpreter right;

  public NonterminalInterpreter(Interpreter left, Interpreter right){
    this.left = left;
    this.right = right;
  }

  @Override
  public void interpret(Context text){
    //非终结符表达式的解释操作
  }

  @Override
  public void execute(){
    //递归调用每一个组成部分的interpret()方法
    //在递归调用时指定组成部分的连接方式，即非终结符的功能
  }
}
