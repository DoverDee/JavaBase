package com.doverdee.thinkinginjava.containers;//: containers/Utilities.java
// Simple demonstrations of the Collections utilities.
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.*;

public class Utilities {
  static List<String> list = Arrays.asList(
    "one Two three Four five six one".split(" "));
  public static void main(String[] args) {
    Print.print(list);
    Print.print("'list' disjoint (Four)?: " +
      Collections.disjoint(list,
        Collections.singletonList("Four")));
    Print.print("max: " + Collections.max(list));
    Print.print("min: " + Collections.min(list));
    Print.print("max w/ comparator: " + Collections.max(list,
      String.CASE_INSENSITIVE_ORDER));
    Print.print("min w/ comparator: " + Collections.min(list,
      String.CASE_INSENSITIVE_ORDER));
    List<String> sublist =
      Arrays.asList("Four five six".split(" "));
    Print.print("indexOfSubList: " +
      Collections.indexOfSubList(list, sublist));
    Print.print("lastIndexOfSubList: " +
      Collections.lastIndexOfSubList(list, sublist));
    Collections.replaceAll(list, "one", "Yo");
    Print.print("replaceAll: " + list);
    Collections.reverse(list);
    Print.print("reverse: " + list);
    Collections.rotate(list, 3);
    Print.print("rotate: " + list);
    List<String> source =
      Arrays.asList("in the matrix".split(" "));
    Collections.copy(list, source);
    Print.print("copy: " + list);
    Collections.swap(list, 0, list.size() - 1);
    Print.print("swap: " + list);
    Collections.shuffle(list, new Random(47));
    Print.print("shuffled: " + list);
    Collections.fill(list, "pop");
    Print.print("fill: " + list);
    Print.print("frequency of 'pop': " +
      Collections.frequency(list, "pop"));
    List<String> dups = Collections.nCopies(3, "snap");
    Print.print("dups: " + dups);
    Print.print("'list' disjoint 'dups'?: " +
      Collections.disjoint(list, dups));
    // Getting an old-style Enumeration:
    Enumeration<String> e = Collections.enumeration(dups);
    Vector<String> v = new Vector<String>();
    while(e.hasMoreElements())
      v.addElement(e.nextElement());
    // Converting an old-style Vector
    // to a List via an Enumeration:
    ArrayList<String> arrayList =
      Collections.list(v.elements());
    Print.print("arrayList: " + arrayList);
  }
} /* Output:
[one, Two, three, Four, five, six, one]
'list' disjoint (Four)?: false
max: three
min: Four
max w/ comparator: Two
min w/ comparator: five
indexOfSubList: 3
lastIndexOfSubList: 3
replaceAll: [Yo, Two, three, Four, five, six, Yo]
reverse: [Yo, six, five, Four, three, Two, Yo]
rotate: [three, Two, Yo, Yo, six, five, Four]
copy: [in, the, matrix, Yo, six, five, Four]
swap: [Four, the, matrix, Yo, six, five, in]
shuffled: [six, matrix, the, Four, Yo, five, in]
fill: [pop, pop, pop, pop, pop, pop, pop]
frequency of 'pop': 7
dups: [snap, snap, snap]
'list' disjoint 'dups'?: true
arrayList: [snap, snap, snap]
*///:~
