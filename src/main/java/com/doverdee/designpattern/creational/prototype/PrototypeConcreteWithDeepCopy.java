package com.doverdee.designpattern.creational.prototype;

import java.io.*;

public class PrototypeConcreteWithDeepCopy implements Prototype, Serializable {
  private String strField;
  private double dbField;
  private ObjectFieldSerializable objField;

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

  public void setObjField(ObjectFieldSerializable objField) {
    this.objField = objField;
  }


  @Override
  public Prototype clone() {
    Prototype pwdc = null;
    try {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(baos);
      oos.writeObject(this);

      ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
      ObjectInputStream ois = new ObjectInputStream(bais);
      pwdc = (PrototypeConcreteWithDeepCopy) ois.readObject();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return pwdc;
  }

  @Override
  public void display() {
    System.out.println("PrototypeConcreteWithDeepCopy.display()");
  }
}
