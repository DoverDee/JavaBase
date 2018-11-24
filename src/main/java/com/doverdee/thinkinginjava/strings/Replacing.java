package com.doverdee.thinkinginjava.strings;//: strings/Replacing.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class Replacing {
  static String s = Splitting.knights;
  public static void main(String[] args) {
    Print.print(s.replaceFirst("f\\w+", "located"));
    Print.print(s.replaceAll("shrubbery|tree|herring","banana"));
  }
} /* Output:
Then, when you have located the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!
Then, when you have found the banana, you must cut down the mightiest banana in the forest... with... a banana!
*///:~
