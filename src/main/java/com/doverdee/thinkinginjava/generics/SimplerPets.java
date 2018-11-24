package com.doverdee.thinkinginjava.generics;//: generics/SimplerPets.java
import java.util.*;

import com.doverdee.thinkinginjava.net.mindview.util.New;
import com.doverdee.thinkinginjava.typeinfo.pets.Person;
import com.doverdee.thinkinginjava.typeinfo.pets.Pet;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
