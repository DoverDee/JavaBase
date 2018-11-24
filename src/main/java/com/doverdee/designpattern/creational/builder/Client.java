package com.doverdee.designpattern.creational.builder;

public class Client {
  public static void main(String[] args) {
    BuildProductA bpa = new BuildProductA();
//    BuildProductB bpb = new BuildProductB();
    Director director = new Director();
    ProductWithManyField productA = director.buildProduct(bpa);
//    ProductWithManyField productA = director.buildProduct(bpb);
    System.out.println("productA.fieldStr=" + productA.getFieldStr());
    System.out.println("productA.fieldInt=" + productA.getFieldInt());
    System.out.println("productA.fieldDouble=" + productA.getFieldDouble());
    System.out.println("productA.fieldObj=" + productA.getFieldOjb());
  }
}
