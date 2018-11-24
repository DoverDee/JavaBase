package com.doverdee.designpattern.creational.builder;

public class ProductWithManyField {
  private String fieldStr;
  private int fieldInt;
  private double fieldDouble;
  private ObjectField fieldOjb;
  //...

  public String getFieldStr() {
    return fieldStr;
  }

  public void setFieldStr(String fieldStr) {
    this.fieldStr = fieldStr;
  }

  public int getFieldInt() {
    return fieldInt;
  }

  public void setFieldInt(int fieldInt) {
    this.fieldInt = fieldInt;
  }

  public double getFieldDouble() {
    return fieldDouble;
  }

  public void setFieldDouble(double fieldDouble) {
    this.fieldDouble = fieldDouble;
  }

  public ObjectField getFieldOjb() {
    return fieldOjb;
  }

  public void setFieldOjb(ObjectField fieldOjb) {
    this.fieldOjb = fieldOjb;
  }
}
