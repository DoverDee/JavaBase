package com.doverdee.designpattern.creational.simplefactory;

import com.doverdee.utils.XMLUtil;

public class Client {
  public static void main(String[] args) {
    //productType can read from properties or xml.
    Product product =  Factory.getProduct(XMLUtil.getProductType());
    //Product product =  Factory.getProduct("F");
    product.methodDiff();
  }
}
