package com.doverdee.designpattern.creational.prototype;

public class PrototypeConcreteWithShallowCopy implements Prototype, Cloneable {
  private String strField;
  private double dbField;
  private ObjectField objField;

  public String getStrField() {
    return strField;
  }

  public void setStrField(String strField) {
    this.strField = strField;
  }

  public double getDbField() {
    return dbField;
  }

  public void setDbField(double dbField) {
    this.dbField = dbField;
  }

  public Object getObjField() {
    return objField;
  }

  public void setObjField(ObjectField objField) {
    this.objField = objField;
  }

  @Override
  public Prototype clone() {
    Prototype pwsc = null;
    try {
      Object obj = super.clone();
      pwsc = (PrototypeConcreteWithShallowCopy) obj;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return pwsc;
  }

  @Override
  public void display() {
    System.out.println("PrototypeConcreteWithShallowCopy.display()");
  }
}
