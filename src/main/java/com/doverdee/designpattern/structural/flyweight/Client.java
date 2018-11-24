package com.doverdee.designpattern.structural.flyweight;

public class Client {
  public static void main(String args[]) {
    Flyweight fwa1,fwa2,fwa3,fwb1,fwb2;
    FlyweightFactory fwfactory;

    //获取享元工厂对象
    fwfactory = FlyweightFactory.getInstance();

    //通过享元工厂获取三颗黑子
    fwa1 = fwfactory.getFlyweight("fwa");
    fwa2 = fwfactory.getFlyweight("fwa");
    fwa3 = fwfactory.getFlyweight("fwa");
    System.out.println("判断两个具体原型对象A是否相同：" + (fwa1==fwa2));

    //通过享元工厂获取两颗白子
    fwb1 = fwfactory.getFlyweight("fwb");
    fwb2 = fwfactory.getFlyweight("fwb");
    System.out.println("判断两颗白子是否相同：" + (fwb1==fwb2));

    //显示棋子
    fwa1.displayFlyweight(new OutField("one", "one"));
    fwa2.displayFlyweight(new OutField("two", "two"));
    fwa3.displayFlyweight(new OutField("three", "three"));
    fwb1.displayFlyweight(new OutField("one", "one"));
    fwb2.displayFlyweight(new OutField("two", "two"));
  }
}
