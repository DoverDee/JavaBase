package com.doverdee.thinkinginjava.holding;//: holding/LinkedListFeatures.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;
import com.doverdee.thinkinginjava.typeinfo.pets.Hamster;
import com.doverdee.thinkinginjava.typeinfo.pets.Pet;
import com.doverdee.thinkinginjava.typeinfo.pets.Pets;
import com.doverdee.thinkinginjava.typeinfo.pets.Rat;

import java.util.*;

public class LinkedListFeatures {
  public static void main(String[] args) {
    LinkedList<Pet> pets =
      new LinkedList<Pet>(Pets.arrayList(5));
    Print.print(pets);
    // Identical:
    Print.print("pets.getFirst(): " + pets.getFirst());
    Print.print("pets.element(): " + pets.element());
    // Only differs in empty-list behavior:
    Print.print("pets.peek(): " + pets.peek());
    // Identical; remove and return the first element:
    Print.print("pets.remove(): " + pets.remove());
    Print.print("pets.removeFirst(): " + pets.removeFirst());
    // Only differs in empty-list behavior:
    Print.print("pets.poll(): " + pets.poll());
    Print.print(pets);
    pets.addFirst(new Rat());
    Print.print("After addFirst(): " + pets);
    pets.offer(Pets.randomPet());
    Print.print("After offer(): " + pets);
    pets.add(Pets.randomPet());
    Print.print("After add(): " + pets);
    pets.addLast(new Hamster());
    Print.print("After addLast(): " + pets);
    Print.print("pets.removeLast(): " + pets.removeLast());
  }
} /* Output:
[Rat, Manx, Cymric, Mutt, Pug]
pets.getFirst(): Rat
pets.element(): Rat
pets.peek(): Rat
pets.remove(): Rat
pets.removeFirst(): Manx
pets.poll(): Cymric
[Mutt, Pug]
After addFirst(): [Rat, Mutt, Pug]
After offer(): [Rat, Mutt, Pug, Cymric]
After add(): [Rat, Mutt, Pug, Cymric, Pug]
After addLast(): [Rat, Mutt, Pug, Cymric, Pug, Hamster]
pets.removeLast(): Hamster
*///:~
