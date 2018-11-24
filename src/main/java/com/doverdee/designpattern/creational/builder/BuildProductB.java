package com.doverdee.designpattern.creational.builder;

public class BuildProductB extends Builder {
  @Override
  public void buildFileStr() {
    pwmf.setFieldStr("ProductB");
  }

  @Override
  public void buildFileInt() {
    pwmf.setFieldInt(13);
  }

  @Override
  public void buildFileDouble() {
    pwmf.setFieldDouble(17.31);
  }

  @Override
  public void buildFileObj() {
    pwmf.setFieldOjb(new ObjectField());
  }
}
