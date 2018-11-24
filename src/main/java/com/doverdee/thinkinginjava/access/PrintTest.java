package com.doverdee.thinkinginjava.access;//: access/PrintTest.java
// Uses the static printing methods in Print.java.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class PrintTest {
  public static void main(String[] args) {
    Print.print("Available from now on!");
    Print.print(100);
    Print.print(100L);
    Print.print(3.14159);
  }
} /* Output:
Available from now on!
100
100
3.14159
*///:~
