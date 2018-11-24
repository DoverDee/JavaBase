package com.doverdee.designpattern.behavioral.command;

import java.io.Serializable;

public abstract class Command implements Serializable {
  protected String name;
  protected Handler handler;

  protected Command(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setHandler(Handler handler) {
    this.handler = handler;
  }

  public abstract void execute();
}
