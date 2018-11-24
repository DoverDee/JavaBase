package com.doverdee.designpattern.behavioral.chainofresponsibility;

public class HandlerConcrete extends Handler {
  public HandlerConcrete(String name) {
    super(name);
  }

  @Override
  public void handleRequest(String request) {
    if (request.equals("Meet the condition.")) {
      //处理请求
      System.out.println(this.name + ".handleRequest(String request)");
    } else {
      //转发请求到下一个继承者
      this.successor.handleRequest(request);
    }
  }
}
