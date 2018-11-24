package com.doverdee.thinkinginjava.reusing;//: reusing/Beetle.java
// The full process of initialization.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class Insect {
  private int i = 9;
  protected int j;
  Insect() {
    Print.print("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 =
    printInit("static Insect.x1 initialized");
  static int printInit(String s) {
    Print.print(s);
    return 47;
  }
}

public class Beetle extends Insect {
  private int k = printInit("Beetle.k initialized");
  public Beetle() {
    Print.print("k = " + k);
    Print.print("j = " + j);
  }
  private static int x2 =
    printInit("static Beetle.x2 initialized");
  public static void main(String[] args) {
    Print.print("Beetle constructor");
    Beetle b = new Beetle();
  }
} /* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
*///:~
