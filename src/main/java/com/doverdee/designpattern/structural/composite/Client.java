package com.doverdee.designpattern.structural.composite;

public class Client {
  public static void main(String[] args) {
    Component cwnc = new CompositeWithNoComponentB("cwnc");
    Component cwnc1 = new CompositeWithNoComponentB("cwnc1");
    Component cwnc2 = new CompositeWithNoComponentA("cwnc2");
    Component cwnc3 = new CompositeWithNoComponentB("cwnc3");
    Component cwnc4 = new CompositeWithNoComponentA("cwnc4");

    Component cwsc = new CompositeWithSubComponent("cwsc");
    Component cwsc1 = new CompositeWithSubComponent("cwsc1");
    Component cwsc2 = new CompositeWithSubComponent("cwsc2");

    cwsc.addComponent(cwnc);
    cwsc.addComponent(cwnc1);
    cwsc.addComponent(cwsc1);
    cwsc.addComponent(cwsc2);
    cwsc2.addComponent(cwnc2);
    cwsc2.addComponent(cwnc3);
    cwsc2.addComponent(cwnc4);

    cwsc.operationMethod();
    System.out.println("========================");
    cwsc2.operationMethod();
    System.out.println("========================");
    cwnc4.operationMethod();
  }
}
