package com.doverdee.designpattern.creational.prototype;

import java.io.*;

public class CopyDeep implements Serializable {
  private String fieldStr;
  private double fieldDb;
  private Object fieldObj;

  public String getFieldStr() {
    return fieldStr;
  }

  public void setFieldStr(String fieldStr) {
    this.fieldStr = fieldStr;
  }

  public Object getFieldObj() {
    return fieldObj;
  }

  public double getFieldDb() {
    return fieldDb;
  }

  public void setFieldDb(double fieldDb) {
    this.fieldDb = fieldDb;
  }

  public void setFieldObj(Object fieldObj) {
    this.fieldObj = fieldObj;
  }

  public CopyDeep clone() {
    CopyDeep pwdc = null;
    try {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(baos);
      oos.writeObject(this);

      ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
      ObjectInputStream ois = new ObjectInputStream(bais);
      pwdc = (CopyDeep) ois.readObject();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return pwdc;
  }
}
