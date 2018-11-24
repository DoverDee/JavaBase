//: polymorphism/shape/Triangle.java
package com.doverdee.thinkinginjava.polymorphism.shape;
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class Triangle extends Shape {
  public void draw() { Print.print("Triangle.draw()"); }
  public void erase() { Print.print("Triangle.erase()"); }
} ///:~
