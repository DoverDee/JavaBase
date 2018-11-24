package com.doverdee.thinkinginjava.strings;//: strings/SplitDemo.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.regex.*;
import java.util.*;

public class SplitDemo {
  public static void main(String[] args) {
    String input =
      "This!!unusual use!!of exclamation!!points";
    Print.print(Arrays.toString(
      Pattern.compile("!!").split(input)));
    // Only do the first three:
    Print.print(Arrays.toString(
      Pattern.compile("!!").split(input, 3)));
  }
} /* Output:
[This, unusual use, of exclamation, points]
[This, unusual use, of exclamation!!points]
*///:~
