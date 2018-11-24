package com.doverdee.designpattern.behavioral.command;

public class Invoker {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void call() {
    command.execute();
  }
}
