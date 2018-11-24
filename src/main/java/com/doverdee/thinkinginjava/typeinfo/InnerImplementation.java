package com.doverdee.thinkinginjava.typeinfo;//: typeinfo/InnerImplementation.java
// Private inner classes can't hide from reflection.
import com.doverdee.thinkinginjava.net.mindview.util.Print;
import com.doverdee.thinkinginjava.typeinfo.interfacea.A;

class InnerA {
  private static class C implements A {
    public void f() { Print.print("public C.f()"); }
    public void g() { Print.print("public C.g()"); }
    void u() { Print.print("package C.u()"); }
    protected void v() { Print.print("protected C.v()"); }
    private void w() { Print.print("private C.w()"); }
  }
  public static A makeA() { return new C(); }
}	

public class InnerImplementation {
  public static void main(String[] args) throws Exception {
    A a = InnerA.makeA();
    a.f();
    System.out.println(a.getClass().getName());
    // Reflection still gets into the private class:
    HiddenImplementation.callHiddenMethod(a, "g");
    HiddenImplementation.callHiddenMethod(a, "u");
    HiddenImplementation.callHiddenMethod(a, "v");
    HiddenImplementation.callHiddenMethod(a, "w");
  }
} /* Output:
public C.f()
InnerA$C
public C.g()
package C.u()
protected C.v()
private C.w()
*///:~
