package com.doverdee.thinkinginjava.generics;//: generics/LimitsOfInference.java
import com.doverdee.thinkinginjava.typeinfo.pets.Person;
import com.doverdee.thinkinginjava.typeinfo.pets.Pet;

import java.util.*;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
