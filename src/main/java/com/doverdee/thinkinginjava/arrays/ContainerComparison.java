package com.doverdee.thinkinginjava.arrays;//: arrays/ContainerComparison.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.*;

class BerylliumSphere {
  private static long counter;
  private final long id = counter++;
  public String toString() { return "Sphere " + id; }
}

public class ContainerComparison {
  public static void main(String[] args) {
    BerylliumSphere[] spheres = new BerylliumSphere[10];
    for(int i = 0; i < 5; i++)
      spheres[i] = new BerylliumSphere();
    Print.print(Arrays.toString(spheres));
    Print.print(spheres[4]);

    List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
    for(int i = 0; i < 5; i++)
      sphereList.add(new BerylliumSphere());
    Print.print(sphereList);
    Print.print(sphereList.get(4));

    int[] integers = { 0, 1, 2, 3, 4, 5 };
    Print.print(Arrays.toString(integers));
    Print.print(integers[4]);

    List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
    intList.add(97);
    Print.print(intList);
    Print.print(intList.get(4));
  }
} /* Output:
[Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4, null, null, null, null, null]
Sphere 4
[Sphere 5, Sphere 6, Sphere 7, Sphere 8, Sphere 9]
Sphere 9
[0, 1, 2, 3, 4, 5]
4
[0, 1, 2, 3, 4, 5, 97]
4
*///:~
