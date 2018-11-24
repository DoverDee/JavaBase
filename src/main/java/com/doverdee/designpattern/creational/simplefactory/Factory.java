package com.doverdee.designpattern.creational.simplefactory;

public class Factory {
  public static Product getProduct(String productType) {
    Product product = null;
    switch (productType) {
      case "A":
        product = new ProductAConcrete();
        break;
      case "B":
        product = new ProductBConcrete();
        break;
      default:
        throw new RuntimeException("None this product["+productType+"].");
    }
    return product;
  }
}
