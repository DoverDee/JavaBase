package com.doverdee.designpattern.behavioral.command;

public class CommandConcreteB extends Command {
  public CommandConcreteB(String name) {
    super(name);
  }

  @Override
  public void execute() {
    System.out.print(getName() + ".execute()-->");
    handler.executeB();
  }


}
