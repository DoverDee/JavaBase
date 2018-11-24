//: annotations/Testable.java
package com.doverdee.thinkinginjava.annotations;
import com.doverdee.thinkinginjava.net.mindview.atunit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test
  void testExecute() { execute(); }
} ///:~
