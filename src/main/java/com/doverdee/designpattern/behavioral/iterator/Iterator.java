package com.doverdee.designpattern.behavioral.iterator;

public interface Iterator{
  /**
   * 将游标指向第一个元素，正向遍历中使用
   */
  void first();

  /**
   * 将游标指向最后一个元素，逆向遍历中使用
   */
  void last();

  /**
   * 判断是否为第一个元素
   *
   * @return true or false
   */
  boolean isFirst();

  /**
   * 判断是否为最后一个元素
   *
   * @return true or false
   */
  boolean isLast();

  /**
   * 将游标指向下一个元素
   */
  void next();

  /**
   * 将游标指向上一个元素
   */
  void previous();

  /**
   * 获取游标指向的下一个元素
   *
   * @return
   */
  Object getNextItem();

  /**
   * 获取游标指向的上一个元素
   *
   * @return
   */
  Object getPreviousItem();
}
