package com.doverdee.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private static Map<String, Flyweight> fm;
  private static FlyweightFactory instance = new FlyweightFactory();

  private FlyweightFactory() {
    //初始化享元池
    fm = new HashMap<>();
    fm.put("fwa", new FlyweightConcreteA());
    fm.put("fwb", new FlyweightConcreteB());
  }

  public static FlyweightFactory getInstance() {
    return instance;
  }

  /**
   * 获取享元具体类
   *
   * @param fk
   * @return
   */
  public Flyweight getFlyweight(String fk) {
    return fm.get(fk);
  }

  /**
   * 动态扩展享元具体类接口
   *
   * @param fkc
   * @param flyweightContrete
   */
  public void setFlyweightConcrete(String fkc, Flyweight flyweightContrete) {
    fm.put(fkc, flyweightContrete);
  }
}
