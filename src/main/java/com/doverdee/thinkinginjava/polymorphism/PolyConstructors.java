package com.doverdee.thinkinginjava.polymorphism;//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class Glyph {
  void draw() { Print.print("Glyph.draw()"); }
  Glyph() {
    Print.print("Glyph() before draw()");
    draw();
    Print.print("Glyph() after draw()");
  }
}	

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    Print.print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    Print.print("RoundGlyph.draw(), radius = " + radius);
  }
}	

public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
