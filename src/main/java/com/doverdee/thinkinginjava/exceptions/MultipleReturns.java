package com.doverdee.thinkinginjava.exceptions;//: exceptions/MultipleReturns.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class MultipleReturns {
  public static void f(int i) {
    Print.print("Initialization that requires cleanup");
    try {
      Print.print("Point 1");
      if(i == 1) return;
      Print.print("Point 2");
      if(i == 2) return;
      Print.print("Point 3");
      if(i == 3) return;
      Print.print("End");
      return;
    } finally {
      Print.print("Performing cleanup");
    }
  }
  public static void main(String[] args) {
    for(int i = 1; i <= 4; i++)
      f(i);
  }
} /* Output:
Initialization that requires cleanup
Point 1
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
End
Performing cleanup
*///:~
