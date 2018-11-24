package com.doverdee.thinkinginjava.enumerated;//: enumerated/CarWash.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.*;

public class CarWash {
  public enum Cycle {
    UNDERBODY {
      void action() { Print.print("Spraying the underbody"); }
    },
    WHEELWASH {
      void action() { Print.print("Washing the wheels"); }
    },
    PREWASH {
      void action() { Print.print("Loosening the dirt"); }
    },
    BASIC {
      void action() { Print.print("The basic wash"); }
    },
    HOTWAX {
      void action() { Print.print("Applying hot wax"); }
    },
    RINSE {
      void action() { Print.print("Rinsing"); }
    },
    BLOWDRY {
      void action() { Print.print("Blowing dry"); }
    };
    abstract void action();
  }
  EnumSet<Cycle> cycles =
    EnumSet.of(Cycle.BASIC, Cycle.RINSE);
  public void add(Cycle cycle) { cycles.add(cycle); }
  public void washCar() {
    for(Cycle c : cycles)
      c.action();
  }
  public String toString() { return cycles.toString(); }
  public static void main(String[] args) {
    CarWash wash = new CarWash();
    Print.print(wash);
    wash.washCar();
    // Order of addition is unimportant:
    wash.add(Cycle.BLOWDRY);
    wash.add(Cycle.BLOWDRY); // Duplicates ignored
    wash.add(Cycle.RINSE);
    wash.add(Cycle.HOTWAX);
    Print.print(wash);
    wash.washCar();
  }
} /* Output:
[BASIC, RINSE]
The basic wash
Rinsing
[BASIC, HOTWAX, RINSE, BLOWDRY]
The basic wash
Applying hot wax
Rinsing
Blowing dry
*///:~
