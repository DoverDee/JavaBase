package com.doverdee.designpattern.creational.prototype;

public class CopyShallow implements Cloneable{
  private String fieldStr;
  private double fieldDb;
  private Object fieldObj;

  public String getFieldStr() {
    return fieldStr;
  }

  public void setFieldStr(String fieldStr) {
    this.fieldStr = fieldStr;
  }

  public double getFieldDb() {
    return fieldDb;
  }

  public void setFieldDb(double fieldDb) {
    this.fieldDb = fieldDb;
  }

  public Object getFieldObj() {
    return fieldObj;
  }

  public void setFieldObj(Object fieldObj) {
    this.fieldObj = fieldObj;
  }

  public CopyShallow clone() {
    CopyShallow pwsc = null;
    try {
      Object obj = super.clone();
      pwsc = (CopyShallow) obj;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return pwsc;
  }
}
