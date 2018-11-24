package com.doverdee.designpattern.creational.builder;

public abstract class Builder {
  protected ProductWithManyField pwmf = new ProductWithManyField();

  public abstract void buildFileStr();

  public abstract void buildFileInt();

  public abstract void buildFileDouble();

  public abstract void buildFileObj();

  public boolean isBuildFileStr() {
    return true;
  }

  public boolean isBuildFileInt() {
    return false;
  }

  public boolean isBuildFileDouble() {
    return true;
  }

  public boolean isBuildFileObj() {
    return false;
  }

  public ProductWithManyField concreteProduct() {
    return pwmf;
  }
}
