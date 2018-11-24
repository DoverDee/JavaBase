package com.doverdee.designpattern.behavioral.templatemethod;

public class Client{
  public static void main(String[] args){
    TemplateConcrete tc = new TemplateConcrete();
    //调用模板方法
    tc.tMethod();
  }
}
