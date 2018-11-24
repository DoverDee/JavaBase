package com.doverdee.thinkinginjava.concurrency;//: concurrency/DaemonsDontRunFinally.java
// Daemon threads don't run the finally clause
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.concurrent.*;

class ADaemon implements Runnable {
  public void run() {
    try {
      Print.print("Starting ADaemon");
      TimeUnit.SECONDS.sleep(1);
    } catch(InterruptedException e) {
      Print.print("Exiting via InterruptedException");
    } finally {
      Print.print("This should always run?");
    }
  }
}

public class DaemonsDontRunFinally {
  public static void main(String[] args) throws Exception {
    Thread t = new Thread(new ADaemon());
    t.setDaemon(true);
    t.start();
  }
} /* Output:
Starting ADaemon
*///:~
