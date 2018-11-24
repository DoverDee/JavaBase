package com.doverdee.designpattern.behavioral.command;

public class InvokerWithCommandQueue {
  private CommandQueue commandQueue;

  public void setCommandQueue(CommandQueue commandQueue) {
    this.commandQueue = commandQueue;
  }

  public void call() {
    commandQueue.execute();
  }
}
