package com.doverdee.thinkinginjava.reusing;//: reusing/originator.java
// Inheritance, constructors and arguments.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

class Game {
  Game(int i) {
    Print.print("Game constructor");
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    super(i);
    Print.print("BoardGame constructor");
  }
}	

class originator extends BoardGame {
  originator() {
    super(11);
    Print.print("originator constructor");
  }
  public static void main(String[] args) {
    originator x = new originator();
  }
}
/* Output:
Game constructor
BoardGame constructor
originator constructor
*///:~
