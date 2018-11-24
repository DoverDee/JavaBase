package com.doverdee.thinkinginjava.operators;//: operators/PassObject.java
// Passing objects to methods may not be
// what you're used to.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class Letter {
  char c;
}

public class PassObject {
  static void f(Letter y) {
    y.c = 'z';
  }
  public static void main(String[] args) {
    Letter x = new Letter();
    x.c = 'a';
    Print.print("1: x.c: " + x.c);
    f(x);
    Print.print("2: x.c: " + x.c);
  }
} /* Output:
1: x.c: a
2: x.c: z
*///:~
