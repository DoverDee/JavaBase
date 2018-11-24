package com.doverdee.designpattern.behavioral.interpreter;

public class PrimitiveCommandNode extends Node{
  private String name;
  private String text;

  //解释基本命令
  public void interpret(Context context){
    name = context.currentToken();
    context.skipToken(name);
    if(!name.equals("PRINT") && !name.equals("BREAK") && !name.equals("SPACE")){
      System.err.println("非法命令！");
    }
    if(name.equals("PRINT")){
      text = context.currentToken();
      context.nextToken();
    }
  }

  public void execute(){
    switch(name){
      case "PRINT":
        System.out.print(text);
        break;
      case "SPACE":
        System.out.print(" ");
        break;
      case "BREAK":
        System.out.println();
        break;
    }
  }
}
