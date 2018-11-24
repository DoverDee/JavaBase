package com.doverdee.designpattern.behavioral.chainofresponsibility;

public class Client {
  public static void main(String[] args) {
    Handler hc, hca, hcb, hcc, hcaw;
    hc = new HandlerConcrete("HandlerConcrete");
    hca = new HandlerConcreteA("HandlerConcreteA");
    hcb = new HandlerConcreteB("HandlerConcreteB");
    hcc = new HandlerConcreteC("HandlerConcreteC");
    hcaw = new HandlerConcreteDefault("HandlerConcreteDefault");
    hc.setSuccessor(hca);
    hca.setSuccessor(hcb);
    hcb.setSuccessor(hcc);
    hcc.setSuccessor(hcaw);

    hc.handleRequest("Meet the condition.");
    hc.handleRequest("Meet the condition B.");
    hc.handleRequest("Meet the condition A.");
    hc.handleRequest("Anything.");
  }
}
