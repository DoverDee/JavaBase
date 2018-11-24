//: interfaces/interfaceprocessor/Apply.java
package com.doverdee.thinkinginjava.interfaces.interfaceprocessor;
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class Apply {
  public static void process(Processor p, Object s) {
    Print.print("Using Processor " + p.name());
    Print.print(p.process(s));
  }
} ///:~
