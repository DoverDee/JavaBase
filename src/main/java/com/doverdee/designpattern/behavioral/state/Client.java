package com.doverdee.designpattern.behavioral.state;

public class Client{
  public static void main(String[] args){
    System.out.println("测试状态由环境类内部自动循环切换:");
    Context context = new Context();
    context.onClick();
    context.onClick();
    context.onClick();

    System.out.println("测试状态有客户端控制切换:");
    context.setValue(0);
    context.request();
    context.setValue(1);
    context.request();
    context.setValue(2);
    context.request();
    context.setValue(0);
    context.request();
  }
}
