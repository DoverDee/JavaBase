package com.doverdee.thinkinginjava.reusing;//: reusing/FinalOverridingIllusion.java
// It only looks like you can override
// a private or private final method.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class WithFinals {
  // Identical to "private" alone:
  private final void f() { Print.print("WithFinals.f()"); }
  // Also automatically "final":
  private void g() { Print.print("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
  private final void f() {
    Print.print("OverridingPrivate.f()");
  }
  private void g() {
    Print.print("OverridingPrivate.g()");
  }
}

class OverridingPrivate2 extends OverridingPrivate {
  public final void f() {
    Print.print("OverridingPrivate2.f()");
  }
  public void g() {
    Print.print("OverridingPrivate2.g()");
  }
}

public class FinalOverridingIllusion {
  public static void main(String[] args) {
    OverridingPrivate2 op2 = new OverridingPrivate2();
    op2.f();
    op2.g();
    // You can upcast:
    OverridingPrivate op = op2;
    // But you can't call the methods:
    //! op.f();
    //! op.g();
    // Same here:
    WithFinals wf = op2;
    //! wf.f();
    //! wf.g();
  }
} /* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*///:~
