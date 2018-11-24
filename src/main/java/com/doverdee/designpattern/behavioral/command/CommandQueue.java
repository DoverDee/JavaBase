package com.doverdee.designpattern.behavioral.command;


import com.doverdee.utils.ObjectUtil;

import java.util.ArrayList;

public class CommandQueue {
  private ArrayList<Command> commands = new ArrayList<>();

  public void addCommand(Command command) {
    commands.add(command);
  }

  public void removeCommand(Command command) {
    commands.remove(command);
  }

  public void execute() {
    for (Object command : commands) {
      ((Command) command).execute();
    }
  }

  /**
   * 将命令集合写入日志文件
   */
  public void save() {
    ObjectUtil.writeCommands(commands);
  }

  /**
   * 从日志文件中提取命令集合，并循环调用每一个命令对象的execute()方法来实现配置文件的重新设置
   */
  public void recover() {
    ArrayList list;
    list = ObjectUtil.readCommands();
    for (Object obj : list) {
      ((Command) obj).execute();
    }
  }
}
