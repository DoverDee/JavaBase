package com.doverdee.designpattern.behavioral.chainofresponsibility;

public class HandlerConcreteC extends Handler {
  public HandlerConcreteC(String name) {
    super(name);
  }

  @Override
  public void handleRequest(String request) {
    if (request.equals("Meet the condition C.")) {
      //处理请求
      System.out.println(this.name + ".handleRequest(String request)");
    } else {
      //转发请求到下一个继承者
      this.successor.handleRequest(request);
    }
  }
}
