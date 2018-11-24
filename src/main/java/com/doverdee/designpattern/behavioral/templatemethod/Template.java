package com.doverdee.designpattern.behavioral.templatemethod;

public abstract class Template{
  /**
   * 模板方法模式中的关键方法，供客户端调用
   * 模板方法定义好了程序执行时的调用方式
   */
  public void tMethod(){
    primitiveMethod();
    if(hookMethod()){
      optionalMethod();
    }
    variableMethod();
    commonMethod();
  }

  /**
   * 必须执行的基本方法
   */
  protected void primitiveMethod(){
    System.out.println("Template.primitiveMethod()");
  }

  /**
   * 可选的基本方法
   */
  protected void optionalMethod(){
    System.out.println("Template.optionalMethod()");
  }

  /**
   * 钩子方法
   *
   * @return 决定某个调用步骤是否被执行
   */
  protected boolean hookMethod(){
    return false;
  }

  /**
   * 更具情况由子类进行具体实现的操作
   */
  protected abstract void variableMethod();

  /**
   * 公共方法
   */
  protected void commonMethod(){
    System.out.println("Template.commonMethod()");
  }

}
