package com.doverdee.thinkinginjava.reusing;//: reusing/Cartoon.java
// Constructor calls during inheritance.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class Art {
  Art() { Print.print("Art constructor"); }
}

class Drawing extends Art {
  Drawing() { Print.print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
  public Cartoon() { Print.print("Cartoon constructor"); }
  public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
