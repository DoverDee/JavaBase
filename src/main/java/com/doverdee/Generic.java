package com.doverdee;

/**
 * @author lijia
 * @Title: Generic
 * @ProjectName JavaBase
 * @Description: TODO
 * @Date 2018-11-25 10:23
 */
public class Generic<T> {
  private T ele;

  public <E> T getEle() {
    E e;
    T type;
    return ele;
  }

  public void setEle(T ele) {
    this.ele = ele;
  }

  public <T, K> K showKeyName(Generic<T> container) {
    return null;
  }
  public <T> void show_1(T t){

    System.out.println(t.toString());
  }
/*  public static  <E> void show_2(T t){
    System.out.println(t.toString());
  }*/
}
