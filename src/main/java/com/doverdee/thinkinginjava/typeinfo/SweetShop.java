package com.doverdee.thinkinginjava.typeinfo;
//: typeinfo/SweetShop.java
// Examination of the way the class loader works.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class Candy {
  static { Print.print("Loading Candy"); }
}

class Gum {
  static { Print.print("Loading Gum"); }
}

class Cookie {
  static { Print.print("Loading Cookie"); }
}

public class SweetShop {
  public static void main(String[] args) {	
    Print.print("inside main");
    new Candy();
    Print.print("After creating Candy");
    try {
      Class.forName("main.java.com.doverdee.thinkinginjava.typeinfo.Gum");
    } catch(ClassNotFoundException e) {
      Print.print("Couldn't find Gum");
    }
    Print.print("After Class.forName(\"Gum\")");
    new Cookie();
    Print.print("After creating Cookie");
  }
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
