package com.doverdee.thinkinginjava.holding;//: holding/ListFeatures.java
import com.doverdee.thinkinginjava.typeinfo.pets.*;
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.util.*;

public class ListFeatures {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Pet> pets = Pets.arrayList(7);
    Print.print("1: " + pets);
    Hamster h = new Hamster();
    pets.add(h); // Automatically resizes
    Print.print("2: " + pets);
    Print.print("3: " + pets.contains(h));
    pets.remove(h); // Remove by object
    Pet p = pets.get(2);
    Print.print("4: " +  p + " " + pets.indexOf(p));
    Pet cymric = new Cymric();
    Print.print("5: " + pets.indexOf(cymric));
    Print.print("6: " + pets.remove(cymric));
    // Must be the exact object:
    Print.print("7: " + pets.remove(p));
    Print.print("8: " + pets);
    pets.add(3, new Mouse()); // Insert at an index
    Print.print("9: " + pets);
    List<Pet> sub = pets.subList(1, 4);
    Print.print("subList: " + sub);
    Print.print("10: " + pets.containsAll(sub));
    Collections.sort(sub); // In-place sort
    Print.print("sorted subList: " + sub);
    // Order is not important in containsAll():
    Print.print("11: " + pets.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    Print.print("shuffled subList: " + sub);
    Print.print("12: " + pets.containsAll(sub));
    List<Pet> copy = new ArrayList<Pet>(pets);
    sub = Arrays.asList(pets.get(1), pets.get(4));
    Print.print("sub: " + sub);
    copy.retainAll(sub);
    Print.print("13: " + copy);
    copy = new ArrayList<Pet>(pets); // Get a fresh copy
    copy.remove(2); // Remove by index
    Print.print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    Print.print("15: " + copy);
    copy.set(1, new Mouse()); // Replace an element
    Print.print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    Print.print("17: " + copy);
    Print.print("18: " + pets.isEmpty());
    pets.clear(); // Remove all elements
    Print.print("19: " + pets);
    Print.print("20: " + pets.isEmpty());
    pets.addAll(Pets.arrayList(4));
    Print.print("21: " + pets);
    Object[] o = pets.toArray();
    Print.print("22: " + o[3]);
    Pet[] pa = pets.toArray(new Pet[0]);
    Print.print("23: " + pa[3].id());
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
