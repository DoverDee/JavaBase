package com.doverdee.designpattern.behavioral.command;

public class CommandConcreteA extends Command {
  public CommandConcreteA(String name) {
    super(name);
  }

  @Override
  public void execute() {
    System.out.print(getName() + ".execute()-->");
    handler.executeA();
  }
}
