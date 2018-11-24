package com.doverdee.thinkinginjava.typeinfo;//: typeinfo/SelectingMethods.java
// Looking for particular methods in a dynamic proxy.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.lang.reflect.*;

class MethodSelector implements InvocationHandler {
  private Object proxied;
  public MethodSelector(Object proxied) {
    this.proxied = proxied;
  }
  public Object
  invoke(Object proxy, Method method, Object[] args)
  throws Throwable {
    if(method.getName().equals("interesting"))
      Print.print("Proxy detected the interesting method");
    return method.invoke(proxied, args);
  }
}	

interface SomeMethods {
  void boring1();
  void boring2();
  void interesting(String arg);
  void boring3();
}

class Implementation implements SomeMethods {
  public void boring1() { Print.print("boring1"); }
  public void boring2() { Print.print("boring2"); }
  public void interesting(String arg) {
    Print.print("interesting " + arg);
  }
  public void boring3() { Print.print("boring3"); }
}	

class SelectingMethods {
  public static void main(String[] args) {
    SomeMethods proxy= (SomeMethods)Proxy.newProxyInstance(
      SomeMethods.class.getClassLoader(),
      new Class[]{ SomeMethods.class },
      new MethodSelector(new Implementation()));
    proxy.boring1();
    proxy.boring2();
    proxy.interesting("bonobo");
    proxy.boring3();
  }
} /* Output:
boring1
boring2
Proxy detected the interesting method
interesting bonobo
boring3
*///:~
