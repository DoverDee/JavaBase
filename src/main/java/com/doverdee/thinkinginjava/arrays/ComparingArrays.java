package com.doverdee.thinkinginjava.arrays;//: arrays/ComparingArrays.java
// Using Arrays.equals()
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.*;

public class ComparingArrays {
  public static void main(String[] args) {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    Arrays.fill(a1, 47);
    Arrays.fill(a2, 47);
    Print.print(Arrays.equals(a1, a2));
    a2[3] = 11;
    Print.print(Arrays.equals(a1, a2));
    String[] s1 = new String[4];
    Arrays.fill(s1, "Hi");
    String[] s2 = { new String("Hi"), new String("Hi"),
      new String("Hi"), new String("Hi") };
    Print.print(Arrays.equals(s1, s2));
  }
} /* Output:
true
false
true
*///:~
