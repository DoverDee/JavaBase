package com.doverdee.thinkinginjava.initialization;//: initialization/OverloadingOrder.java
// Overloading based on the order of the arguments.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class OverloadingOrder {
  static void f(String s, int i) {
    Print.print("String: " + s + ", int: " + i);
  }
  static void f(int i, String s) {
    Print.print("int: " + i + ", String: " + s);
  }
  public static void main(String[] args) {
    f("String first", 11);
    f(99, "Int first");
  }
} /* Output:
String: String first, int: 11
int: 99, String: Int first
*///:~
