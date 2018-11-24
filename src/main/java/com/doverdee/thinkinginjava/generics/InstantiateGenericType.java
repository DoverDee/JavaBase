package com.doverdee.thinkinginjava.generics;//: generics/InstantiateGenericType.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class ClassAsFactory<T> {
  T x;
  public ClassAsFactory(Class<T> kind) {
    try {
      x = kind.newInstance();
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}

//class Employee {}

public class InstantiateGenericType {
  public static void main(String[] args) {
    ClassAsFactory<Employee> fe =
      new ClassAsFactory<Employee>(Employee.class);
      Print.print("ClassAsFactory<Employee> succeeded");
    try {
      ClassAsFactory<Integer> fi =
        new ClassAsFactory<Integer>(Integer.class);
        Print.print("ClassAsFactory<Integer> succeeded");
    } catch(Exception e) {
      Print.print("ClassAsFactory<Integer> failed");
    }
  }
} /* Output:
ClassAsFactory<Employee> succeeded
ClassAsFactory<Integer> failed
*///:~
