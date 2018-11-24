package com.doverdee.utils;

import java.io.*;
import java.util.ArrayList;

public class ObjectUtil {
  //将命令集合写入日志文件
  public static void writeCommands(ArrayList commands) {
    try {
      FileOutputStream file = new FileOutputStream("resource/commandObjects.log");
      //创建对象输出流用于将对象写入到文件中
      ObjectOutputStream objOut = new ObjectOutputStream(new BufferedOutputStream(file));
      //将对象写入文件
      objOut.writeObject(commands);
      objOut.close();
    } catch (Exception e) {
      System.out.println("命令保存失败！");
      e.printStackTrace();
    }
  }

  //从日志文件中提取命令集合
  public static ArrayList readCommands() {
    try {
      FileInputStream file = new FileInputStream("resource/commandObjects.log");
      //创建对象输入流用于从文件中读取对象
      ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(file));

      //将文件中的对象读出并转换为ArrayList类型
      ArrayList commands = (ArrayList) objIn.readObject();
      objIn.close();
      return commands;
    } catch (Exception e) {
      System.out.println("命令读取失败！");
      e.printStackTrace();
      return null;
    }
  }
}
