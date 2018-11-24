package com.doverdee.designpattern.behavioral.memento;

public class Client{
  private static int index = -1; //定义一个索引来记录当前状态所在位置
  private static Caretaker caretaker = new Caretaker();

  public static void main(String[] args){
    Originator originator = new Originator("车", 0, 0);
    play(originator);
    originator.setY(4);
    play(originator);
    originator.setX(5);
    play(originator);
    undo(originator, index);
    undo(originator, index);
    originator.setY(3);
    originator.setX(3);
    play(originator);
    originator.setX(6);
    play(originator);
    originator.setY(9);
    play(originator);
    undo(originator, index);
  }

  /**
   * 下棋
   *
   * @param originator 需备份对象(源发器)
   */
  public static void play(Originator originator){
    index++;
    caretaker.setMemento(originator.crteateMemento(), index); //保存备忘录
    System.out.println("棋子" + originator.getState() + "当前位置为：" + "第" + originator.getX() + "行" + "第" + originator.getY() + "列。");
  }

  /**
   * 悔棋
   *
   * @param originator 需备份对象(原发器)
   * @param i          需备份对象(原发器)在负责保存备忘录对象的集合中的存储位置
   */
  public static void undo(Originator originator, int i){
    System.out.println("******悔棋******");
    index--;
    originator.restore(caretaker.getMemento(i - 1)); //撤销到上一个备忘录
    System.out.println("棋子" + originator.getState() + "当前位置为：" + "第" + originator.getX() + "行" + "第" + originator.getY() + "列。");
  }
}