package com.doverdee.thinkinginjava.enumerated;//: enumerated/OverrideConstantSpecific.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public enum OverrideConstantSpecific {
  NUT, BOLT,
  WASHER {
    void f() { Print.print("Overridden method"); }
  };
  void f() { Print.print("default behavior"); }
  public static void main(String[] args) {
    for(OverrideConstantSpecific ocs : values()) {
      Print.printnb(ocs + ": ");
      ocs.f();
    }
  }
} /* Output:
NUT: default behavior
BOLT: default behavior
WASHER: Overridden method
*///:~
