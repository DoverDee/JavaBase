package com.doverdee.thinkinginjava.containers;//: containers/Stacks.java
// Demonstration of Stack Class.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.*;

enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER }

public class Stacks {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    for(Month m : Month.values())
      stack.push(m.toString());
    Print.print("stack = " + stack);
    // Treating a stack as a Vector:
    stack.addElement("The last line");
    Print.print("element 5 = " + stack.elementAt(5));
    Print.print("popping elements:");
    while(!stack.empty())
      Print.printnb(stack.pop() + " ");

    // Using a LinkedList as a Stack:
    LinkedList<String> lstack = new LinkedList<String>();
    for(Month m : Month.values())
      lstack.addFirst(m.toString());
    Print.print("lstack = " + lstack);
    while(!lstack.isEmpty())
      Print.printnb(lstack.removeFirst() + " ");

    // Using the Stack class from
    // the Holding Your Objects Chapter:
   com.doverdee.thinkinginjava.net.mindview.util.Stack<String> stack2 =
      new com.doverdee.thinkinginjava.net.mindview.util.Stack<String>();
    for(Month m : Month.values())
      stack2.push(m.toString());
    Print.print("stack2 = " + stack2);
    while(!stack2.empty())
      Print.printnb(stack2.pop() + " ");

  }
} /* Output:
stack = [JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER]
element 5 = JUNE
popping elements:
The last line NOVEMBER OCTOBER SEPTEMBER AUGUST JULY JUNE MAY APRIL MARCH FEBRUARY JANUARY lstack = [NOVEMBER, OCTOBER, SEPTEMBER, AUGUST, JULY, JUNE, MAY, APRIL, MARCH, FEBRUARY, JANUARY]
NOVEMBER OCTOBER SEPTEMBER AUGUST JULY JUNE MAY APRIL MARCH FEBRUARY JANUARY stack2 = [NOVEMBER, OCTOBER, SEPTEMBER, AUGUST, JULY, JUNE, MAY, APRIL, MARCH, FEBRUARY, JANUARY]
NOVEMBER OCTOBER SEPTEMBER AUGUST JULY JUNE MAY APRIL MARCH FEBRUARY JANUARY
*///:~
