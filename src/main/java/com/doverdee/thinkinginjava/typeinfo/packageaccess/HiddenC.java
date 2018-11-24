//: typeinfo/packageaccess/HiddenC.java
package com.doverdee.thinkinginjava.typeinfo.packageaccess;
import com.doverdee.thinkinginjava.net.mindview.util.Print;
import com.doverdee.thinkinginjava.typeinfo.interfacea.A;

class C implements A {
  public void f() { Print.print("public C.f()"); }
  public void g() { Print.print("public C.g()"); }
  void u() { Print.print("package C.u()"); }
  protected void v() { Print.print("protected C.v()"); }
  private void w() { Print.print("private C.w()"); }
}

public class HiddenC {
  public static A makeA() { return new C(); }
} ///:~
