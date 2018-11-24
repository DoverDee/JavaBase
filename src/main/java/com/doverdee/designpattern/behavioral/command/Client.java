package com.doverdee.designpattern.behavioral.command;

public class Client {
  public static void main(String[] args) {
    Invoker invoker = new Invoker();
    Handler handler = new Handler();

    Command commandA = new CommandConcreteA("CommandConcreteA");
    commandA.setHandler(handler);
    invoker.setCommand(commandA);
    invoker.call();

    Command commandB = new CommandConcreteB("CommandConcreteB");
    commandB.setHandler(handler);
    invoker.setCommand(commandB);
    invoker.call();

    System.out.println("------------------------------");

    InvokerWithCommandQueue iWcq = new InvokerWithCommandQueue();
    CommandQueue commandQueue = new CommandQueue();
    commandQueue.addCommand(commandB);
    commandQueue.addCommand(commandA);
    commandQueue.save();//保存命令集合到日志文件中
    iWcq.setCommandQueue(commandQueue);
    iWcq.call();

    System.out.println("------------------------------");

    commandQueue.recover();//提取文件中的命令集合并执行
  }
}
