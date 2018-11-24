package com.doverdee.thinkinginjava.concurrency;//: concurrency/DaemonFromFactory.java
// Using a Thread Factory to create daemons.
import java.util.concurrent.*;

import com.doverdee.thinkinginjava.net.mindview.util.DaemonThreadFactory;
import com.doverdee.thinkinginjava.net.mindview.util.Print;

public class DaemonFromFactory implements Runnable {
  public void run() {
    try {
      while(true) {
        TimeUnit.MILLISECONDS.sleep(100);
        Print.print(Thread.currentThread() + " " + this);
      }
    } catch(InterruptedException e) {
      Print.print("Interrupted");
    }
  }
  public static void main(String[] args) throws Exception {
    ExecutorService exec = Executors.newCachedThreadPool(
      new DaemonThreadFactory());
    for(int i = 0; i < 10; i++)
      exec.execute(new DaemonFromFactory());
    Print.print("All daemons started");
    TimeUnit.MILLISECONDS.sleep(500); // Run for a while
  }
} /* (Execute to see output) *///:~
