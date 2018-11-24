package com.doverdee.thinkinginjava.io;//: io/OSExecuteDemo.java
// Demonstrates standard I/O redirection.
import com.doverdee.thinkinginjava.net.mindview.util.OSExecute;

public class OSExecuteDemo {
  public static void main(String[] args) {
      OSExecuteDemo od = new OSExecuteDemo();
      od.getPath();
      OSExecute.command("javap D:\\ideaWorkspace\\ThinkingInJava\\out\\production\\ThinkingInJava1\\com\\doverlee\\io\\OSExecuteDemo");
  }

  public  void getPath() {
      String path = this.getClass().getResource("").toString();
      System.out.println(path);
  }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
