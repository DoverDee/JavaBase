package com.doverdee.thinkinginjava.containers;//: containers/RandomBounds.java
// Does Math.random() produce 0.0 and 1.0?
// {RunByHand}
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class RandomBounds {
  static void usage() {
    Print.print("Usage:");
    Print.print("\tRandomBounds lower");
    Print.print("\tRandomBounds upper");
    System.exit(1);
  }
  public static void main(String[] args) {
    if(args.length != 1) usage();
    if(args[0].equals("lower")) {
      while(Math.random() != 0.0)
        ; // Keep trying
      Print.print("Produced 0.0!");
    }
    else if(args[0].equals("upper")) {
      while(Math.random() != 1.0)
        ; // Keep trying
      Print.print("Produced 1.0!");
    }
    else
      usage();
  }
} ///:~
