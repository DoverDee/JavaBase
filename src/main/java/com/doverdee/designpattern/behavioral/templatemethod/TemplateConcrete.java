package com.doverdee.designpattern.behavioral.templatemethod;

/**
 * 具体模板类，实现父类方法，并根据情况覆盖父类方法
 */
public class TemplateConcrete extends Template{
  @Override
  protected void variableMethod(){
    System.out.println("TemplateConcrete.variableMethod()");
  }

  @Override
  protected boolean hookMethod(){
    return true;
  }

  @Override
  protected void optionalMethod(){
    System.out.println("TemplateConcrete.optionalMethod()");
  }
}
