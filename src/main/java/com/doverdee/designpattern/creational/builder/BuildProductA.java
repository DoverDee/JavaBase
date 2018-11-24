package com.doverdee.designpattern.creational.builder;

public class BuildProductA extends Builder {
  @Override
  public void buildFileStr() {
    pwmf.setFieldStr("ProductA");
  }

  @Override
  public void buildFileInt() {
    pwmf.setFieldInt(31);
  }

  @Override
  public void buildFileDouble() {
    pwmf.setFieldDouble(31.17);
  }

  @Override
  public void buildFileObj() {
    pwmf.setFieldOjb(new ObjectField());
  }

  @Override
  public boolean isBuildFileDouble() {
    return false;
  }
}
