package com.doverdee.thinkinginjava.operators;//: operators/Bool.java
// Relational and logical operators.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.*;

public class Bool {
  public static void main(String[] args) {
    Random rand = new Random(47);
    int i = rand.nextInt(100);
    int j = rand.nextInt(100);
    Print.print("i = " + i);
    Print.print("j = " + j);
    Print.print("i > j is " + (i > j));
    Print.print("i < j is " + (i < j));
    Print.print("i >= j is " + (i >= j));
    Print.print("i <= j is " + (i <= j));
    Print.print("i == j is " + (i == j));
    Print.print("i != j is " + (i != j));
    // Treating an int as a boolean is not legal Java:
//! print("i && j is " + (i && j));
//! print("i || j is " + (i || j));
//! print("!i is " + !i);
    Print.print("(i < 10) && (j < 10) is "
       + ((i < 10) && (j < 10)) );
    Print.print("(i < 10) || (j < 10) is "
       + ((i < 10) || (j < 10)) );
  }
} /* Output:
i = 58
j = 55
i > j is true
i < j is false
i >= j is true
i <= j is false
i == j is false
i != j is true
(i < 10) && (j < 10) is false
(i < 10) || (j < 10) is false
*///:~
