package com.doverdee.designpattern.creational.builder;

public class Director {
  public ProductWithManyField buildProduct(Builder builder) {
    if (builder.isBuildFileStr()) {
      builder.buildFileStr();
    }

    if (builder.isBuildFileInt()) {
      builder.buildFileInt();
    }

    if (builder.isBuildFileDouble()) {
      builder.buildFileDouble();
    }

    if (builder.isBuildFileObj()) {
      builder.buildFileObj();
    }

    return builder.concreteProduct();
  }
}
