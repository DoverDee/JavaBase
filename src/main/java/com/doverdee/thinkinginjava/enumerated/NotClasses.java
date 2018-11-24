package com.doverdee.thinkinginjava.enumerated;//: enumerated/NotClasses.java
// {Exec: javap -c LikeClasses}
import com.doverdee.thinkinginjava.net.mindview.util.Print;

enum LikeClasses {
  WINKEN { void behavior() { Print.print("Behavior1"); } },
  BLINKEN { void behavior() { Print.print("Behavior2"); } },
  NOD { void behavior() { Print.print("Behavior3"); } };
  abstract void behavior();
}

public class NotClasses {
  // void f1(LikeClasses.WINKEN instance) {} // Nope
} /* Output:
Compiled from "NotClasses.java"
abstract class LikeClasses extends java.lang.Enum{
public static final LikeClasses WINKEN;

public static final LikeClasses BLINKEN;

public static final LikeClasses NOD;
...
*///:~
