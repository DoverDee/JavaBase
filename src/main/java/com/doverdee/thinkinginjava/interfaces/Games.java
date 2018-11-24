package com.doverdee.thinkinginjava.interfaces;//: interfaces/Games.java
// A Game framework using Factory Methods.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

class Checkers implements Game {
  private int moves = 0;
  private static final int MOVES = 3;
  public boolean move() {
    Print.print("Checkers move " + moves);
    return ++moves != MOVES;
  }
}

class CheckersFactory implements GameFactory {
  public Game getGame() { return new Checkers(); }
}	

class originator implements Game {
  private int moves = 0;
  private static final int MOVES = 4;
  public boolean move() {
    Print.print("originator move " + moves);
    return ++moves != MOVES;
  }
}

class originatorFactory implements GameFactory {
  public Game getGame() { return new originator(); }
}	

public class Games {
  public static void playGame(GameFactory factory) {
    Game s = factory.getGame();
    while(s.move())
      ;
  }
  public static void main(String[] args) {
    playGame(new CheckersFactory());
    playGame(new originatorFactory());
  }
} /* Output:
Checkers move 0
Checkers move 1
Checkers move 2
originator move 0
originator move 1
originator move 2
originator move 3
*///:~
