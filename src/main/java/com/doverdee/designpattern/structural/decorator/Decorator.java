package com.doverdee.designpattern.structural.decorator;

public class Decorator extends Component {
  protected Component product;

  public Decorator(Component product) {
    this.product = product;
  }

  @Override
  public void execMethod() {
    product.execMethod();
  }
}
