package com.doverdee.designpattern.behavioral.state;

public class Context{
  private int value;
  private State state, sa, sb, sc;

  /**
   * @param value 状态对应的值
   */
  public void setValue(int value){
    this.value = value;
  }

  /**
   * @param state 环境对象拥有的状态对象
   */
  public void setState(State state){
    this.state = state;
  }

  public Context(){
    this.sa = new StateConcreteA();
    this.sb = new StateConcreteB();
    this.sc = new StateConcreteC();
    this.state = sa; //设置初始状态
    this.state.display();
  }

  public void request(){
    //检查状态对象是否改变
    changeState();
    //调用状态对象的业务方法
    state.handle();
  }

  /**
   * 该方法可有客户端代码通过在执行request()方法之前调用setState()来切换状态
   */
  public void changeState(){
    //判断属性值，根据属性值进行状态转换
    if(value == 0){
      this.setState(sa);
    }else if(value == 1){
      this.setState(sb);
    }else if(value == 2){
      this.setState(sc);
    }
  }

  /**
   * 该方法在客户端代码调用时自动循环切换自身状态
   */
  public void onClick(){
    if(this.state == sa){
      this.setState(sb);
      this.state.display();
    }else if(this.state == sb){
      this.setState(sc);
      this.state.display();
    }else if(this.state == sc){
      this.setState(sa);
      this.state.display();
    }
  }
}
