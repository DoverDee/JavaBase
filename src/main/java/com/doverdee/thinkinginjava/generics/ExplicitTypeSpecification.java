package com.doverdee.thinkinginjava.generics;//: generics/ExplicitTypeSpecification.java
import java.util.*;

import com.doverdee.thinkinginjava.net.mindview.util.New;
import com.doverdee.thinkinginjava.typeinfo.pets.Person;
import com.doverdee.thinkinginjava.typeinfo.pets.Pet;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
