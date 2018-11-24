package com.doverdee.designpattern.structural.flyweight;

public class OutField {
  private String fieldOne;
  private String fieldTwo;

  public OutField(String fieldOne, String fieldTwo) {
    this.fieldOne = fieldOne;
    this.fieldTwo = fieldTwo;
  }

  public String getFieldOne() {
    return fieldOne;
  }

  public void setFieldOne(String fieldOne) {
    this.fieldOne = fieldOne;
  }

  public String getFieldTwo() {
    return fieldTwo;
  }

  public void setFieldTwo(String fieldTwo) {
    this.fieldTwo = fieldTwo;
  }
}
