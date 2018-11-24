//: polymorphism/shape/Square.java
package com.doverdee.thinkinginjava.polymorphism.shape;
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class Square extends Shape {
  public void draw() { Print.print("Square.draw()"); }
  public void erase() { Print.print("Square.erase()"); }
} ///:~
