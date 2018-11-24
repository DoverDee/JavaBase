package com.doverdee.thinkinginjava.holding;//: holding/PetMap.java
import com.doverdee.thinkinginjava.typeinfo.pets.Cat;
import com.doverdee.thinkinginjava.typeinfo.pets.Dog;
import com.doverdee.thinkinginjava.typeinfo.pets.Hamster;
import com.doverdee.thinkinginjava.typeinfo.pets.Pet;

import java.util.*;
import static com.doverdee.thinkinginjava.net.mindview.util.Print.*;

public class PetMap {
  public static void main(String[] args) {
    Map<String,Pet> petMap = new HashMap<String,Pet>();
    petMap.put("My Cat", new Cat("Molly"));
    petMap.put("My Dog", new Dog("Ginger"));
    petMap.put("My Hamster", new Hamster("Bosco"));
    print(petMap);
    Pet dog = petMap.get("My Dog");
    print(dog);
    print(petMap.containsKey("My Dog"));
    print(petMap.containsValue(dog));
  }
} /* Output:
{My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
Dog Ginger
true
true
*///:~
