package com.doverdee.thinkinginjava.io.xfiles;//: io/xfiles/ThawAlien.java
// Try to recover a serialized file without the
// class of object that's stored in that file.
// {RunByHand}
import com.doverdee.thinkinginjava.io.Alien;

import java.io.*;

public class ThawAlien {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in = new ObjectInputStream(
      new FileInputStream(new File(".", "X.file")));
      Alien mystery = (Alien)in.readObject();

    System.out.println(mystery.getClass());
    System.out.println(mystery);
  }
} /* Output:
class Alien
*///:~
